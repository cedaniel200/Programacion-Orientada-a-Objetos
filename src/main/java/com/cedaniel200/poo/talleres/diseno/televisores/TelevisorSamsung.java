package com.cedaniel200.poo.talleres.diseno.televisores;

public class TelevisorSamsung extends TelevisorPorDefecto {

    @Override
    public void cambiarCanal(int canal) {
        System.out.println("SAMSUNG cambiando a canal " + canal);
    }

    @Override
    public void cambiarVolumen(int volumen) {
        System.out.println("SAMSUNG cambiando a volumen " + volumen);
    }

    @Override
    public void cambiarEntrada(TipoEntrada tipoEntrada) {
        System.out.println("SAMSUNG cambiando a entrada " + tipoEntrada.getNombre());
    }

    @Override
    public String getDescripcion() {
        return "TV SAMSUNG";
    }
}
