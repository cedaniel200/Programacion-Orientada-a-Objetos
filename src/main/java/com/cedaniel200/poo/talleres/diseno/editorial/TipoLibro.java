package com.cedaniel200.poo.talleres.diseno.editorial;

public enum TipoLibro {
    NOVELA("Novela"),
    ARTE("Arte"),
    GUIA("Guia");

    private String nombre;

    TipoLibro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
