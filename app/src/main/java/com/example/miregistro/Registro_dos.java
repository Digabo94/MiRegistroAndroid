package com.example.miregistro;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.content.SharedPreferences;


import androidx.appcompat.app.AppCompatActivity;

import com.example.domain.UsuarioDTO;
import com.example.excepciones.Excepciones;
import com.example.listaSharedPreferences.SharedPreferencesUsuarios;

public class Registro_dos extends AppCompatActivity {

    EditText nombre, direccion, edad;
    RadioButton masculino, femenino;
    ImageButton regresarRegistro, confirmarRegistro;
    UsuarioDTO usuarioDTO;
    SharedPreferences creacionLista;
    SharedPreferencesUsuarios listaUsuarios;
    Intent miIntencion;
    String sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_dos);

        nombre = findViewById(R.id.nombre);
        direccion = findViewById(R.id.direccion);
        edad = findViewById(R.id.edad);
        masculino = findViewById(R.id.masculino);
        femenino = findViewById(R.id.femenino);
        regresarRegistro = findViewById(R.id.regresarRegistro);
        confirmarRegistro = findViewById(R.id.confirmarRegistro);
    }

    public void onClickRadioButton(View view) {
        switch (view.getId()){
            case R.id.masculino:
                sexo = "Masculino";
                break;
            case R.id.femenino:
                sexo = "Femenino";
                break;
        }
    }


    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.regresarRegistro:
                finish();
                break;
            case R.id.confirmarRegistro:
                Excepciones nulos = new Excepciones();
                if (nulos.campoNuloNumerico(nombre, direccion, edad, getApplicationContext())){
                    creacionLista = getSharedPreferences("ListaUsuarios", Context.MODE_PRIVATE);
                    listaUsuarios = new SharedPreferencesUsuarios();
                    usuarioDTO = new UsuarioDTO(nombre, direccion, edad, sexo);
                    listaUsuarios.guardarUsuario(usuarioDTO, creacionLista, getApplicationContext());
                    miIntencion = new Intent(getApplicationContext(), Navegacion.class);
                    startActivity(miIntencion);
                }
                break;
        }
    }
}