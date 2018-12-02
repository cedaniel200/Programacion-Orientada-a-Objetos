package com.cedaniel200.poo.talleres.solid.inversiondependencia.titiritero.capaaltonivel;

public class Gepetto implements Titiritero {

    private Titere titere;

    public Gepetto(Titere titere) {
        this.titere = titere;
    }

    @Override
    public void setTitere(Titere titere) {
        this.titere = titere;
    }

    @Override
    public void mostrarTitereInmovil() {
        titere.inmovil();
    }

    @Override
    public void moverCabezaDelTitere() {
        titere.moverCabeza();
    }

    @Override
    public void moverBrazoIzquierdoDelTitere() {
        titere.moverBrazoIzquierdo();
    }

    @Override
    public void moverBrazoDerechoDelTitere() {
        titere.moverBrazoDerecho();
    }

    @Override
    public void moverPiernaIzquierdoDelTitere() {
        titere.moverPiernaIzquierdo();
    }

    @Override
    public void moverPiernaDerechoDelTitere() {
        titere.moverPiernaDerecho();
    }
}