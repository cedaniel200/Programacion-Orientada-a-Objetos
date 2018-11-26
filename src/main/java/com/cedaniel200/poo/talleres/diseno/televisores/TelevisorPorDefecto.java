package com.cedaniel200.poo.talleres.diseno.televisores;

public abstract class TelevisorPorDefecto implements Televisor {

    @Override
    public void prender(){
        System.out.println("TV Prendido");
    }

    @Override
    public void apagar(){
        System.out.println("TV Apagado");
    }

}