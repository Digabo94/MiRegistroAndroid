package com.example.sharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.domain.UsuarioDTO;

public class SharedPreferencesUsuarios {

    public void guardarUsuario(UsuarioDTO usuarioDTO){
        SharedPreferences preferences = getSharedPreferences("Usuarios",Context.MODE_PRIVATE);

        SharedPreferencesUsuarios.Editor


    }
}
