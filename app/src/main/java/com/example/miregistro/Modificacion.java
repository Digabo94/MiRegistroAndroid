package com.example.miregistro;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.domain.UsuarioDTO;
import com.example.listaSharedPreferences.SharedPreferencesUsuarios;

public class Modificacion extends AppCompatActivity {

    Spinner spinnerCampos;
    EditText input, editTextPass;
    ImageButton regresarNavegacion, confirmarModificacion;
    RadioButton f, m;
    SharedPreferences listaUsuarios;
    SharedPreferencesUsuarios modificarLista;
    UsuarioDTO usuarioDTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificacion);

        spinnerCampos = findViewById(R.id.campos);
        input = findViewById(R.id.input);
        editTextPass = findViewById(R.id.editTextPass);
        regresarNavegacion = findViewById(R.id.regresarNavegacion);
        confirmarModificacion = findViewById(R.id.confirmarModificacion);
        f = findViewById(R.id.f);
        m = findViewById(R.id.m);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.array_campos,
                android.R.layout.simple_spinner_item);
        spinnerCampos.setAdapter(adapter);
    }

    public void onClickConfirmarModificacion(View view) {
        listaUsuarios = getSharedPreferences("ListaUsuarios", Context.MODE_PRIVATE);
        usuarioDTO.setPassword(editTextPass.getText().toString());
        modificarLista.modificarUsuario(usuarioDTO, listaUsuarios, getApplicationContext());
    }

    public void onClickRegresarNavegacion(View view) {
    }
}