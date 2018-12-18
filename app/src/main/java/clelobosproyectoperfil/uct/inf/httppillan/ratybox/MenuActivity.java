package clelobosproyectoperfil.uct.inf.httppillan.ratybox;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    public static Context activity;
    ImageButton imgBt1, imgBt2, imgBt3, imgBt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        imgBt1 = (ImageButton) findViewById(R.id.guiabt);
        imgBt2 = (ImageButton) findViewById(R.id.noticiabt);
        imgBt3 = (ImageButton) findViewById(R.id.webbt);
        imgBt4 = (ImageButton) findViewById(R.id.policiebt);

        imgBt1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intentGuia = new Intent(MenuActivity.this, GuiaActivity.class);
                MenuActivity.this.startActivity(intentGuia);
            }
        });

        imgBt2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intentNoticia = new Intent(MenuActivity.this, NoticiaActivity.class);
                MenuActivity.this.startActivity(intentNoticia);
            }
        });

        imgBt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse("http://pillan.inf.uct.cl/~elobos/proyecto/avance1/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        imgBt4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intentPolicie = new Intent(MenuActivity.this, PolicieActivity.class);
                MenuActivity.this.startActivity(intentPolicie);
            }
        });
    }
}
