package clelobosproyectoperfil.uct.inf.httppillan.ratybox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.Response;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

public class Registro extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    EditText reg_user, reg_cor, reg_pass;
    Button reg_btn;
    Spinner Genero;
    ArrayAdapter<String> aaZ;
    String [] ArregloG = new String[] {"Femenino","Masculino"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Genero = (Spinner) findViewById(R.id.Genero);
        Genero.setOnItemSelectedListener(this);
        aaZ = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, ArregloG );
        Genero.setAdapter(aaZ);
        reg_user =(EditText) findViewById(R.id.reg_user);
        reg_cor = (EditText) findViewById(R.id.reg_co);
        reg_pass = (EditText) findViewById(R.id.re_pass);
        reg_btn = (Button) findViewById(R.id.reg_btn);
        reg_btn.setOnClickListener(this);


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        final String NomUser=reg_user.getText().toString();
        final String Contraseña=reg_pass.getText().toString();
        final String Correo=reg_cor.getText().toString();
        final String genero= Genero.toString();

        Response.Listener<String> respoListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonresponse = new JSONObject(response);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };



        registerRequest registerRequest = new registerRequest (NomUser, Contraseña, Correo, genero, respoListener );
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
    }
}
