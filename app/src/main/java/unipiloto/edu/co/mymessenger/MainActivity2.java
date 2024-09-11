package unipiloto.edu.co.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textActivity1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textActivity1= findViewById(R.id.textActivity1);
        String mensaje = getIntent().getExtras().getString("mensaje");
        textActivity1.setText(mensaje);

    }
}