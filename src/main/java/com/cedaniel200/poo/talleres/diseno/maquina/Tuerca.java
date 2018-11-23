package com.cedaniel200.poo.talleres.diseno.maquina;

public class Tuerca implements Pieza {
    @Override
    public String obtenerNombre() {
        return "Tuerca";
    }

    @Override
    public String obtenerMateriales() {
        return "Acero";
    }

    @Override
    public String obtenerModoDeInstalacion() {
        return "Girar sobre un Tornillo";
    }
}
