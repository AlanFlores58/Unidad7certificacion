package com.example.alanflores.unidad7certificacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button botonPresionar;
    Spinner spinnerColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonPresionar = (Button) findViewById(R.id.button_presionar);
        spinnerColor = (Spinner) findViewById(R.id.spinner);

        //Evento por definicion de interfaz
        botonPresionar.setOnClickListener(this);

        //Implementacion de un evento por definicion de clase anonima
        botonPresionar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //Implementacion de un evento por definicion de una clase interna
        botonPresionar.setOnClickListener(eventoBoton);
    }

    private View.OnClickListener eventoBoton = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            finish();
        }
    };

    @Override
    public void onClick(View v) {
        finish();
    }
}
