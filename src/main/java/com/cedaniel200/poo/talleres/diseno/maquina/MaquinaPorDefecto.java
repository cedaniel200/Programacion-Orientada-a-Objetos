package com.cedaniel200.poo.talleres.diseno.maquina;

public abstract class MaquinaPorDefecto implements Maquina {

    @Override
    public void prender(){
        System.out.println("Maquina Prendida");
    }

    @Override
    public void apagar(){
        System.out.println("Maquina Apagada");
    }

}
