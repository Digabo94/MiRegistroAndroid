package com.example.miregistro;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;

import animaciones.AnimacionBotones;

import androidx.appcompat.app.AppCompatActivity;

public class Navegacion extends AppCompatActivity {

    ImageButton imageButton;
    RadioButton modificarUsuario, buscarUsuario, salir;
    AnimacionBotones botones = new AnimacionBotones();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegacion);
        imageButton = findViewById(R.id.siguiente);
        modificarUsuario = findViewById(R.id.modificarUsuario);
        buscarUsuario = findViewById(R.id.buscarUsuario);
        salir = findViewById(R.id.salir);
        botones.animacionRadioButton(modificarUsuario, buscarUsuario, salir, imageButton);
    }



    public void radioGroup(View view) {
        botones.animacionRadioButton(modificarUsuario, buscarUsuario, salir, imageButton);
    }
}