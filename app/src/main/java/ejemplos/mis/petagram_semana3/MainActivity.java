package ejemplos.mis.petagram_semana3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button botonASegundaActividad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonASegundaActividad = (Button) findViewById(R.id.button);
        botonASegundaActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this , ActivityFavoritos.class));
            }
        });

    }

   /* public void irAFavoritos(View v){
        Intent intent = new Intent(this,ActivityFavoritos.class);
        startActivity(intent);
    }
    */
}
