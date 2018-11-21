package com.cedaniel200.poo.talleres.diseno.solucionbasico;

public enum PublicoObjetivo {

    HOMBRES("Hombres"),
    MUJERES("Mujeres"),
    UNISEX("Unisex");

    private String descripcion;

    PublicoObjetivo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
