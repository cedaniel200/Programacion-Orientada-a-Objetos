package com.cedaniel200.poo.talleres.diseno.maquina;

public class Engranaje implements Pieza {
    @Override
    public String obtenerNombre() {
        return "Engranaje";
    }

    @Override
    public String obtenerMateriales() {
        return "Acero";
    }

    @Override
    public String obtenerModoDeInstalacion() {
        return "Colocar junto a otros Engranaje";
    }
}
