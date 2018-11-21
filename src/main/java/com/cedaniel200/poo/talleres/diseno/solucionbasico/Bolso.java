package com.cedaniel200.poo.talleres.diseno.solucionbasico;

public abstract class Bolso implements Cartera {

    @Override
    public void abrir() {
        System.out.println("Abriendo Bolso");
    }

    @Override
    public void cerrar() {
        System.out.println("Cerrando Bolso");
    }

    public abstract void cambiarABolsoDeMano();
}
