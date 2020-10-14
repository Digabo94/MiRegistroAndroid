package com.example.miregistro;

import androidx.appcompat.app.AppCompatActivity;
import com.example.domain.UsuarioDTO;
import com.example.excepciones.Excepciones;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registro_uno extends AppCompatActivity {

    EditText correoElectronico, nombreUsuario, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_uno);
        correoElectronico = findViewById(R.id.correoElectronico);
        nombreUsuario = findViewById(R.id.nombreUsuario);
        password = findViewById(R.id.password);
    }

    public void onClick(View view){
        Intent miIntencion = new Intent(getApplicationContext(), Registro_dos.class);
        Excepciones nulos  = new Excepciones();
        if(nulos.campoNulo(correoElectronico, nombreUsuario, password, getApplicationContext())) {
            UsuarioDTO usuarioDTO = new UsuarioDTO(correoElectronico, nombreUsuario, password);
            startActivity(miIntencion);
        }
    }
}