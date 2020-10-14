package com.example.excepciones;

import android.app.Activity;
import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;
import com.example.miregistro.*;

import androidx.appcompat.app.AppCompatActivity;

import com.example.miregistro.Registro_uno;

public class Excepciones extends AppCompatActivity {

    public boolean campoNulo(EditText editText1, EditText editText2, EditText editText3, Context context){
        boolean verificarNulo = false;
        if((editText1.getText().toString().isEmpty()) || (editText2.getText().toString().isEmpty()) || (editText3.getText().toString().isEmpty())){
            verificarNulo = false;
            Toast.makeText(context,"No puede haber campos nulos", Toast.LENGTH_LONG).show();
        } else{
            verificarNulo = true;
        }
        return verificarNulo;
    }

    public boolean campoNuloNumerico(EditText editText1, EditText editText2, EditText editText3, Context context){
        boolean verificarNulo = false;
        if (this.valorNumerico(editText3, context)){
            if((editText1.getText().toString().isEmpty()) || (editText2.getText().toString().isEmpty()) || (editText3.getText().toString().isEmpty())){
                verificarNulo = false;
                Toast.makeText(context,"No puede haber campos nulos", Toast.LENGTH_LONG).show();
            } else{
                verificarNulo = true;
            }
        }
        return verificarNulo;
    }

    private boolean valorNumerico(EditText editText, Context context){
        int edad = 0;
        boolean verificarNumero = false;
        try{
            edad = Integer.parseInt(editText.getText().toString());
            verificarNumero = true;
        } catch (NumberFormatException e){
            Toast.makeText(context,"Introduzca un valor entero",Toast.LENGTH_LONG).show();
        }
        return verificarNumero;
    }
}
