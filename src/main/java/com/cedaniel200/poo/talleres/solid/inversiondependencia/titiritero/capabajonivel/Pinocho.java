package com.cedaniel200.poo.talleres.solid.inversiondependencia.titiritero.capabajonivel;

import com.cedaniel200.poo.talleres.solid.inversiondependencia.titiritero.capaaltonivel.Titere;

public class Pinocho implements Titere {

    @Override
    public void inmovil() {
        mostrarCabezaQuieta();
        mostrarBrazosQuietos();
        mostrarTroncoQuieto();
        mostrarPiernasQuietos();
    }

    @Override
    public void moverCabeza() {
        System.out.println(" o-- ");
        mostrarBrazosQuietos();
        mostrarTroncoQuieto();
        mostrarPiernasQuietos();
    }

    @Override
    public void moverBrazoIzquierdo() {
        mostrarCabezaQuieta();
        System.out.println("/ |");
        mostrarTroncoQuieto();
        mostrarPiernasQuietos();
    }

    @Override
    public void moverBrazoDerecho() {
        mostrarCabezaQuieta();
        System.out.println("| \\");
        mostrarTroncoQuieto();
        mostrarPiernasQuietos();
    }

    @Override
    public void moverPiernaIzquierdo() {
        mostrarCabezaQuieta();
        mostrarBrazosQuietos();
        mostrarTroncoQuieto();
        System.out.println("/ |");
    }

    @Override
    public void moverPiernaDerecho() {
        mostrarCabezaQuieta();
        mostrarBrazosQuietos();
        mostrarTroncoQuieto();
        System.out.println("| \\");
    }

    private void mostrarCabezaQuieta(){
        System.out.println(" O ");
    }

    private void mostrarBrazosQuietos(){
        System.out.println("| |");
    }

    private void mostrarTroncoQuieto() {
        System.out.println(" | ");
    }

    private void mostrarPiernasQuietos(){
        System.out.println("| |");
    }
}
