package com.cedaniel200.poo.talleres.diseno.accesorios;

public enum Material {

    CUERO_VACA("Vaca"),
    CUERO_BECERRO("Beccero"),
    CUERO_POTRO("Potro"),
    CUERO_CERDO("Cerdo");

    private String nombre;

    Material(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
