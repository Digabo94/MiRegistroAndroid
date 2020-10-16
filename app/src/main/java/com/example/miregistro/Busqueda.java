package com.example.miregistro;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.listaSharedPreferences.ModificacionLista;

import androidx.appcompat.app.AppCompatActivity;

public class Busqueda extends AppCompatActivity {


    EditText inputBusqueda;
    TextView correo, usuario, nombre, direccion, edad, sexo;
    String itemSpinner;
    SharedPreferences preference;
    ModificacionLista miLista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        inputBusqueda = findViewById(R.id.inputBusqueda);
        correo = findViewById(R.id.correo);
        usuario = findViewById(R.id.usuario);
        nombre = findViewById(R.id.nombre);
        direccion = findViewById(R.id.direccion);
        edad = findViewById(R.id.edad);
        sexo = findViewById(R.id.sexo);
    }

    public void onClickBusqueda(View view) {
        preference = getSharedPreferences("ListaUsuarios", Context.MODE_PRIVATE);
        miLista = new ModificacionLista();
        miLista.buscarUsuarioCampos("Correo electrónico", correo, inputBusqueda, preference, getApplicationContext(), false);
        miLista.buscarUsuarioCampos("Usuario", usuario, inputBusqueda, preference, getApplicationContext(), false);
        miLista.buscarUsuarioCampos("Nombre", nombre, inputBusqueda, preference, getApplicationContext(), false);
        miLista.buscarUsuarioCampos("Edad", edad, inputBusqueda, preference, getApplicationContext(), true);
        miLista.buscarUsuarioCampos("Dirección", direccion, inputBusqueda, preference, getApplicationContext(), false);
        miLista.buscarUsuarioCampos("Sexo", sexo, inputBusqueda, preference, getApplicationContext(), false);
    }
    public void onClickRegresar(View view) {
        finish();
    }
}