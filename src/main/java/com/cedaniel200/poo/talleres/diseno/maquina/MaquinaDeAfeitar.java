package com.cedaniel200.poo.talleres.diseno.maquina;

import java.util.ArrayList;
import java.util.List;

public class MaquinaDeAfeitar extends MaquinaPorDefecto {

    @Override
    public boolean ejecutarMantenimiento() {
        System.out.println("Maquina Ejecutando Mantenimiento");
        return true;
    }

    @Override
    public List<Pieza> obtenerPiezas() {
        List<Pieza> piezas = new ArrayList<>();
        piezas.add(new Engranaje());
        piezas.add(new Tuerca());
        return piezas;
    }

    @Override
    public String obtenerUltimaAlerta() {
        return "Alerta: ninguna";
    }

    @Override
    public String obtenerDescripcion() {
        return "Maquina que te permite afeitarte";
    }
}