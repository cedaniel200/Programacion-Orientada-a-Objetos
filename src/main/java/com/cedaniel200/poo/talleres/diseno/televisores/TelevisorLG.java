package com.cedaniel200.poo.talleres.diseno.televisores;

public class TelevisorLG extends TelevisorPorDefecto  {

    private int volumenActual = 0;

    @Override
    public void cambiarCanal(int canal) {
        System.out.println("TV cambiado al canal " + canal);
    }

    @Override
    public void cambiarVolumen(int volumen) {
        System.out.println("TV pasa del volumen " + volumenActual + " a " + volumen);
        volumenActual = volumen;
    }

    @Override
    public void cambiarEntrada(TipoEntrada tipoEntrada) {
        System.out.println("TV entrada " + tipoEntrada.getNombre());
    }

    @Override
    public String getDescripcion() {
        return "TV LG";
    }
}