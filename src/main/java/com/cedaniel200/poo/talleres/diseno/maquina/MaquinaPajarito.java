package com.cedaniel200.poo.talleres.diseno.maquina;

import java.util.ArrayList;
import java.util.List;

public class MaquinaPajarito extends MaquinaPorDefecto {

    @Override
    public void apagar() {
        System.out.println("ANTES-PAJARITO");
        System.out.println("DESPUES-PAJARITO");
    }

    @Override
    public boolean ejecutarMantenimiento() {
        return false;
    }

    @Override
    public List<Pieza> obtenerPiezas() {
        return new ArrayList<>();
    }

    @Override
    public String obtenerUltimaAlerta() {
        return "Ninguna Alerta";
    }

    @Override
    public String obtenerDescripcion() {
        return "Maquina que hace cucu - cucu";
    }
}
