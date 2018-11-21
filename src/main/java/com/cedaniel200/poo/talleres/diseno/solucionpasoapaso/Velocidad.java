package com.cedaniel200.poo.talleres.diseno.solucionpasoapaso;

public enum Velocidad {
    CERO("0"),
    UNO("1"),
    DOS("2"),
    TRES("3"),
    CUATRO("4");

    private String velocidad;

    Velocidad(String velocidad){
        this.velocidad = velocidad;
    }

    public String getVelocidad(){
        return velocidad;
    }

}