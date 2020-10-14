package com.example.miregistro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

public class Bienvenido extends AppCompatActivity {
    CheckBox checkBoxRegistro;
    ImageButton registrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxRegistro = findViewById(R.id.checkBoxRegistro);
        registrarse = findViewById(R.id.registrarse);
    }

    public void onClick(View view) {
        Intent miIntencion;
        if(checkBoxRegistro.isChecked()){
            miIntencion = new Intent(getApplicationContext(), Registro_uno.class);
            startActivity(miIntencion);
        } else{
            Toast.makeText(getApplicationContext(),"Es necesario confirmar inicio de registro", Toast.LENGTH_SHORT).show();
        }
    }
}