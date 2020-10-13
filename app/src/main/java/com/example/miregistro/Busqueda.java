package com.example.miregistro;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Busqueda extends AppCompatActivity {

    Spinner campos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        campos = findViewById(R.id.campos);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.array_campos,
                android.R.layout.simple_spinner_item);
        campos.setAdapter(adapter);
    }
}