package com.cdp.agenda.entidades;

public class Contactos {

    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo_electronico;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_electornico() {
        return correo_electronico;
    }

    public void setCorreo_electornico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }
}
