package com.example.preferencias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btconfiguracion;
    private Button btver;
    private MainActivityViewModel vm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();
    }
    public  void inicializar(){
        btconfiguracion= findViewById(R.id.btConfig);
        btver= findViewById(R.id.btVer);
        btconfiguracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext() , ConfiguracionActivity.class);
                startActivity(intent);
            }
        });
        btver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext() , MostrarActivity.class);
                startActivity(intent);
            }
        });
    }
}