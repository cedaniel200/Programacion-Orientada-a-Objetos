package com.cedaniel200.poo.talleres.diseno.televisores;

public enum TipoEntrada {

    VIDEO("VIDEO"),
    HDMI("HDMI"),
    VGA("VGA");

    private String nombre;

    TipoEntrada(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}
