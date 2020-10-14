package com.example.miregistro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;

import animaciones.AnimacionBotones;

import androidx.appcompat.app.AppCompatActivity;

public class Navegacion extends AppCompatActivity {

    ImageButton siguiente, regresar;
    RadioButton modificarUsuario, buscarUsuario, salir;
    AnimacionBotones botones = new AnimacionBotones();
    Intent miIntencion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegacion);
        siguiente = findViewById(R.id.siguiente);
        regresar = findViewById(R.id.regresar);
        modificarUsuario = findViewById(R.id.modificarUsuario);
        buscarUsuario = findViewById(R.id.buscarUsuario);
        salir = findViewById(R.id.salir);

        botones.animacionRadioButton(modificarUsuario, buscarUsuario, salir, siguiente);
    }

    public void radioGroup(View view) {
        botones.animacionRadioButton(modificarUsuario, buscarUsuario, salir, siguiente);
    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.siguiente:
                if(modificarUsuario.isChecked()){
                  miIntencion = new Intent(getApplicationContext(), Modificacion.class);
                } else if (buscarUsuario.isChecked()){
                    miIntencion = new Intent(getApplicationContext(), Busqueda.class);
                } else {
                    finish();
                }
                break;
            case R.id.regresar:
                finish();
                break;
        }
        startActivity(miIntencion);
    }
}