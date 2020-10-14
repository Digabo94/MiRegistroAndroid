package com.example.listaSharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.domain.UsuarioDTO;

public class SharedPreferencesUsuarios{

    public void guardarUsuario(UsuarioDTO usuarioDTO, SharedPreferences preferences, Context context){
         SharedPreferences.Editor editor = preferences.edit();

        editor.putString(usuarioDTO.getPassword(), usuarioDTO.getCorreoElectronico());
        editor.putString(usuarioDTO.getPassword(), usuarioDTO.getDireccion());
        editor.putString(usuarioDTO.getPassword(), usuarioDTO.getNombre());
        editor.putString(usuarioDTO.getPassword(), usuarioDTO.getPassword());
        editor.putString(usuarioDTO.getPassword(), usuarioDTO.getSexo());
        editor.putString(usuarioDTO.getPassword(), usuarioDTO.getUsuario());
        editor.putInt(usuarioDTO.getPassword(), usuarioDTO.getEdad());
        editor.commit();
        Toast.makeText(context,"¡Usuario registrado!", Toast.LENGTH_LONG).show();
    }

    public void modificarUsuario(UsuarioDTO usuarioDTO, SharedPreferences preferences, Context context){
        preferences.getString(usuarioDTO.getPassword(),"El usuario no existe");
    }
}
