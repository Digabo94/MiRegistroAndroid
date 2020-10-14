package com.example.domain;

import android.widget.EditText;

public class UsuarioDTO {
    static private String correoElectronico;
    static private String usuario;
    static private String password;
    static private String direccion;
    static private String nombre;
    static private int edad;
    static private String sexo;

    public UsuarioDTO (){}

    public UsuarioDTO(EditText correoElectronico, EditText usuario, EditText password){
        this.correoElectronico = correoElectronico.getText().toString();
        this.usuario = usuario.getText().toString();
        this.password = password.getText().toString();
    }

    public UsuarioDTO(EditText direccion, EditText nombre, EditText edad, String sexo){
        this.nombre = nombre.getText().toString();
        this.direccion = direccion.getText().toString();
        this.edad = Integer.parseInt(edad.getText().toString());
        this.sexo = sexo;
    }

    public UsuarioDTO(String correoElectronico, String usuario, String password, String direccion, String nombre, int edad, String sexo){
        this.correoElectronico = correoElectronico;
        this.usuario = usuario;
        this.password = password;
        this.direccion = direccion;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }


    public static String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        UsuarioDTO.correoElectronico = correoElectronico;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        UsuarioDTO.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        UsuarioDTO.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        UsuarioDTO.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        UsuarioDTO.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        UsuarioDTO.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        UsuarioDTO.sexo = sexo;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{Correo: " + this.correoElectronico + "}" + " {Usuario: " + this.usuario + "}" + " {Password: " + this.password +"}"
        + " {Nombre: " + this.nombre + "}" + " {Direccion: " + this.direccion + "}" + " {Edad: "+ this.edad + "}" + " {Sexo: " + this.sexo + "}";
    }
}
