package clelobosproyectoperfil.uct.inf.httppillan.ratybox;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NoticiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        WebView view = (WebView) findViewById(R.id.NoticiaViewer);
        view.getSettings().setJavaScriptEnabled(true); //permite que algunas paginas funcionen bien
        view.getSettings().setBuiltInZoomControls(true); //permite que se pueda hacer zoom
        view.loadUrl("https://www.levelup.com/noticias");

        view.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                return false;
            }
        });
    }
}
