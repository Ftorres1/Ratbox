package clelobosproyectoperfil.uct.inf.httppillan.ratybox;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    TextView tv_registrar;
    TextView tv_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        tv_registrar = (TextView) findViewById(R.id.tv_reg);
        tv_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReg = new Intent(MainActivity.this, Registro.class);
                MainActivity.this.startActivity(intentReg);
            }
        });

        tv_login = (TextView) findViewById(R.id.tv_log);

        tv_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                Intent i = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(i);
            }
        });






    }
}
