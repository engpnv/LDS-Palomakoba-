package com.example.exerc3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_numero;
    Button bt_verificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_numero = findViewById(R.id.et_numero);
        bt_verificar = findViewById(R.id.bt_verificar);

        bt_verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = Integer.parseInt(et_numero.getText().toString());

                for(int i=2; i<numero; i++){
                    if(numero%i==0){
                        Toast.makeText(MainActivity.this, "O número "+numero+" não é primo", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                Toast.makeText(MainActivity.this, "O número "+numero+" é primo", Toast.LENGTH_SHORT).show();
            }
        });

    }
}