package unipiloto.edu.co.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etEscribir;
    Button buttonActibity1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etEscribir = findViewById(R.id.etEscribir);
        buttonActibity1 = findViewById(R.id.buttonActibity1);

        buttonActibity1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("mensaje",etEscribir.getText().toString());
                startActivity(intent);
            }
        });

    }
}