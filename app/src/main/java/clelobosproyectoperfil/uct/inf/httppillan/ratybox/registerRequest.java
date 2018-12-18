package clelobosproyectoperfil.uct.inf.httppillan.ratybox;

import android.content.Intent;
import android.widget.Spinner;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class registerRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL="http://pillan.inf.uct.cl/~elobos/proyecto/final/register.php";
    private Map<String, String> params;
    public registerRequest(String NomUser, String Contraseña, String Correo, String gen, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("NomUser", NomUser);
        params.put("Contraseña", Contraseña);
        params.put("Correo", Correo);
        params.put("Genero", gen+"");
    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}