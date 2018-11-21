package com.cedaniel200.poo.talleres.herenciamultiple.solucion;

public class Liquadora extends Electrodomestico implements Cosa, AparatoElectico, Maquina {

    @Override
    public int getVoltage() {
        return 220;
    }

    @Override
    public String getForma() {
        return "cuadrada";
    }

    @Override
    public String getDescripcion() {
        return "Tiene una base";
    }
}
