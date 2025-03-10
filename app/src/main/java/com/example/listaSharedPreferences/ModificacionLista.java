package com.example.listaSharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.excepciones.Excepciones;

import androidx.appcompat.app.AppCompatActivity;
import com.example.domain.UsuarioDTO;

public class ModificacionLista{

    public void guardarUsuario(UsuarioDTO usuarioDTO, SharedPreferences preferences, Context context){
         SharedPreferences.Editor editor = preferences.edit();

        editor.putString(usuarioDTO.getPassword() + "Correo electrónico", usuarioDTO.getCorreoElectronico());
        editor.putString(usuarioDTO.getPassword() + "Dirección", usuarioDTO.getDireccion());
        editor.putString(usuarioDTO.getPassword() + "Nombre", usuarioDTO.getNombre());
        editor.putString(usuarioDTO.getPassword() + "Contraseña", usuarioDTO.getPassword());
        editor.putString(usuarioDTO.getPassword() + "Sexo", usuarioDTO.getSexo());
        editor.putString(usuarioDTO.getPassword() + "Usuario", usuarioDTO.getUsuario());
        editor.putInt(usuarioDTO.getPassword() + "Edad", usuarioDTO.getEdad());
        editor.apply();
        Toast.makeText(context,"¡Usuario registrado!", Toast.LENGTH_LONG).show();
    }

    public void modificarUsuario(EditText input, String itemSpinner, UsuarioDTO usuarioDTO, SharedPreferences preferences, Context context){
        Excepciones excepcion = new Excepciones();
        String passwordModificacion = null;
        if(itemSpinner == "Edad") {
            passwordModificacion = String.valueOf(preferences.getInt(usuarioDTO.getPassword() + itemSpinner, 0));
        } else {
            passwordModificacion = preferences.getString(usuarioDTO.getPassword() + itemSpinner, "El usuario no existe");
        }

if(excepcion.campoNulo(input, context)) {
    if (passwordModificacion == "El usuario no existe" || passwordModificacion == "0") {
        Toast.makeText(context, "El usuario no existe", Toast.LENGTH_LONG).show();
    } else {
        SharedPreferences.Editor editor = preferences.edit();
        switch (itemSpinner) {
            case "Correo electrónico":
                usuarioDTO.setCorreoElectronico(input.getText().toString());
                editor.putString(usuarioDTO.getPassword() + itemSpinner, usuarioDTO.getCorreoElectronico());
                break;
            case "Usuario":
                usuarioDTO.setUsuario(input.getText().toString());
                editor.putString(usuarioDTO.getPassword() + itemSpinner, usuarioDTO.getUsuario());
                break;
            case "Contraseña":
                usuarioDTO.setPassword(input.getText().toString());
                editor.putString(usuarioDTO.getPassword() + itemSpinner, usuarioDTO.getPassword());
                break;
            case "Nombre":
                usuarioDTO.setNombre(input.getText().toString());
                editor.putString(usuarioDTO.getPassword() + itemSpinner, usuarioDTO.getNombre());
                break;
            case "Dirección":
                usuarioDTO.setDireccion(input.getText().toString());
                editor.putString(usuarioDTO.getPassword() + itemSpinner, usuarioDTO.getDireccion());
                break;
            case "Edad":
                usuarioDTO.setEdad(Integer.parseInt(input.getText().toString()));
                editor.putInt(usuarioDTO.getPassword() + itemSpinner, usuarioDTO.getEdad());
                break;
            case "Sexo":
                usuarioDTO.setSexo(input.getText().toString());
                editor.putString(usuarioDTO.getPassword() + itemSpinner, usuarioDTO.getSexo());
                break;
        }
        editor.apply();
        Toast.makeText(context, "Se ha modificado exitosamente", Toast.LENGTH_LONG).show();
    }
}
   }




    public void buscarUsuarioCampos(String campo, TextView tV, EditText editText, SharedPreferences preferences, Context context, boolean tipoDatoNumerico) {
        Excepciones excepcion = new Excepciones();
        String valor = "";

        if (excepcion.campoNulo(editText, context)) {
            valor = preferences.getString(editText.getText().toString() + "Correo electrónico", "No encontrado");
        }

        if(valor != "No encontrado" && valor != ""){
            if (tipoDatoNumerico == false)
            tV.setText(campo +": " + preferences.getString(editText.getText().toString() + campo, "Error"));
            else{
                tV.setText(campo + ": " + String.valueOf(preferences.getInt(editText.getText().toString() + campo, 0)));
            }
        } else{
            tV.setText(campo +": " + valor);
        }
    }
}
