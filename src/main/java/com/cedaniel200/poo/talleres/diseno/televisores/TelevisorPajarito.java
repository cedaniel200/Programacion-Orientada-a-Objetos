package com.cedaniel200.poo.talleres.diseno.televisores;

public class TelevisorPajarito extends TelevisorPorDefecto {

    @Override
    public void apagar() {
        System.out.println("ANTES");
        super.apagar();
        System.out.println("DESPUES");
    }

    @Override
    public void cambiarCanal(int canal) {
        System.out.println("PAJARITO cambiando al canal " + canal);
    }

    @Override
    public void cambiarVolumen(int volumen) {
        System.out.println("PAJARITO cambiando el volumen " + volumen);
    }

    @Override
    public void cambiarEntrada(TipoEntrada tipoEntrada) {
        System.out.println("PAJARITO cambiando a la entrada " + tipoEntrada);
    }

    @Override
    public String getDescripcion() {
        return "TV PAJARITO";
    }
}
