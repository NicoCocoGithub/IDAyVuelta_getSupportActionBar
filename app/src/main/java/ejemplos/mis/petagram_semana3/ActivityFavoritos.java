package ejemplos.mis.petagram_semana3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityFavoritos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
