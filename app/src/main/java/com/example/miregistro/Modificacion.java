package com.example.miregistro;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.domain.UsuarioDTO;
import com.example.listaSharedPreferences.SharedPreferencesUsuarios;

public class Modificacion extends AppCompatActivity {

    Spinner spinnerCampos;
    TextView sexoModificar;
    EditText input, editTextPass;
    ImageButton regresarNavegacion, confirmarModificacion;
    RadioButton f, m;
    SharedPreferences listaUsuarios;
    SharedPreferencesUsuarios modificarLista;
    UsuarioDTO usuarioDTO;
    String itemSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificacion);

        spinnerCampos = findViewById(R.id.campos);
        input = findViewById(R.id.inputBusqueda);
        editTextPass = findViewById(R.id.editTextPass);
        sexoModificar = findViewById(R.id.sexoModificar);
        regresarNavegacion = findViewById(R.id.regresarNavegacion);
        confirmarModificacion = findViewById(R.id.confirmarModificacion);
        f = findViewById(R.id.f);
        m = findViewById(R.id.m);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.array_campos,
                android.R.layout.simple_spinner_item);
        spinnerCampos.setAdapter(adapter);

        spinnerCampos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                itemSpinner = parent.getItemAtPosition(position).toString();

                switch (itemSpinner) {
                    case "Sexo":
                        sexoModificar.clearAnimation();
                        f.clearAnimation();
                        m.clearAnimation();
                        input.clearAnimation();
                        sexoModificar.setVisibility(View.VISIBLE);
                        f.setVisibility(View.VISIBLE);
                        m.setVisibility(View.VISIBLE);
                        input.setVisibility(View.GONE);
                        break;

                    case "Edad":
                        input.clearAnimation();
                        sexoModificar.clearAnimation();
                        f.clearAnimation();
                        m.clearAnimation();
                        sexoModificar.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        m.setVisibility(View.GONE);
                        input.setVisibility(View.VISIBLE);
                        input.setInputType(InputType.TYPE_CLASS_NUMBER);
                        break;
                    case "Contraseña":
                        input.clearAnimation();
                        sexoModificar.clearAnimation();
                        f.clearAnimation();
                        m.clearAnimation();
                        sexoModificar.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        m.setVisibility(View.GONE);
                        input.setVisibility(View.VISIBLE);
                        input.setInputType(InputType.TYPE_TEXT_VARIATION_WEB_PASSWORD);
                        break;
                    default:
                        sexoModificar.clearAnimation();
                        f.clearAnimation();
                        m.clearAnimation();
                        input.clearAnimation();
                        sexoModificar.setVisibility(View.GONE);
                        f.setVisibility(View.GONE);
                        m.setVisibility(View.GONE);
                        input.setVisibility(View.VISIBLE);
                        input.setInputType(InputType.TYPE_CLASS_TEXT);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }

    public void onClickConfirmarModificacion(View view) {
        modificarLista = new SharedPreferencesUsuarios();
        usuarioDTO = new UsuarioDTO();
        listaUsuarios = getSharedPreferences("ListaUsuarios", Context.MODE_PRIVATE);
        usuarioDTO.setPassword(editTextPass.getText().toString());
        modificarLista.modificarUsuario(input, itemSpinner, usuarioDTO, listaUsuarios, getApplicationContext());
    }

    public void onClickRegresarNavegacion(View view) {
        finish();
    }

    public void onClickSpinner(View view) {
    }
}