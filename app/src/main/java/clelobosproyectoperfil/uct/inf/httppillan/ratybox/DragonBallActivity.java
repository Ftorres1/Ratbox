package clelobosproyectoperfil.uct.inf.httppillan.ratybox;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DragonBallActivity extends AppCompatActivity {

    TextView t;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragonball);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        leerarchivo.start();
    }

    Thread leerarchivo = new Thread() {
        public void run() {
            try {
                String dato = "";
                String contents = "";
                TextView t = (TextView) findViewById(R.id.infodb1);

                URLConnection conn = new URL("http://pillan.inf.uct.cl/~mgonzalez/InfoJuegos/DragonBall/DB.txt").openConnection();
                InputStream in = conn.getInputStream();

                contents = readStream(in);
                dato = convertToUTF8(contents);
                t.setText(dato);

            } catch (IOException e) {
                Log.w(e.getMessage(), e);
            }


        }

    };




    public String readStream(InputStream in) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(in));
        StringBuilder total = new StringBuilder();
        String line;
        while ((line = r.readLine()) != null) {
            total.append(line);
            total.append(System.getProperty("line.separator"));
        }
        if (r != null) {
            r.close();
        }
        in.close();
        return total.toString();
    }

    public static String convertToUTF8(String s) {
        String out = null;
        try {
            out = new String(s.getBytes("UTF-8"), "ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e) {
            return null;
        }
        return out;
    }
}

