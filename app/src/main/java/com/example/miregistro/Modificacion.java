package com.example.miregistro;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Modificacion extends AppCompatActivity {

    Spinner spinnerCampos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificacion);

        spinnerCampos = findViewById(R.id.campos);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.array_campos,
                android.R.layout.simple_spinner_item);
        spinnerCampos.setAdapter(adapter);

    }
}