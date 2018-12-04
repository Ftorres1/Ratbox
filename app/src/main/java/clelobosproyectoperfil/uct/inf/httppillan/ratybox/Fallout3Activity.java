package clelobosproyectoperfil.uct.inf.httppillan.ratybox;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class Fallout3Activity extends AppCompatActivity {

    TextView tv_text;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fallout3);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        tv_text = (TextView) findViewById(R.id.infofallout1);

        String text = "";

        try{
            InputStream is = getAssets().open("Fallout3/Intruduccion/file.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        tv_text.setText(text);
    }
}
