package clelobosproyectoperfil.uct.inf.httppillan.ratybox;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class GuiaActivity extends AppCompatActivity {

    ImageButton bt1, bt2, bt3, bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bt1 = (ImageButton) findViewById(R.id.BtJuego1);
        bt2 = (ImageButton) findViewById(R.id.BtJuego2);

        bt1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intentFallout3 = new Intent(GuiaActivity.this, Fallout3Activity.class);
                GuiaActivity.this.startActivity(intentFallout3);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intentDB = new Intent(GuiaActivity.this, DragonBallActivity.class);
                GuiaActivity.this.startActivity(intentDB);
            }
        });

    }
}
