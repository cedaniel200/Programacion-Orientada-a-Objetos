package com.cedaniel200.poo.talleres.diseno.solucionpasoapaso;

import static com.cedaniel200.poo.talleres.diseno.solucionpasoapaso.Ventilador.imprimir;

public abstract class VentiladorTorre implements Ventilador {

    private static final String TIPO = "Ventilador de Torre";
    private boolean estaEncendido = false;

    @Override
    public void encender(Velocidad velocidad){
        estaEncendido = true;
        imprimir(getTipo(), "Encendido");
        cambiarVelocidad(velocidad);
    }

    @Override
    public void apagar(){
        estaEncendido = false;
        cambiarVelocidad(Velocidad.CERO);
        imprimir(getTipo(), "Apagado");
    }

    @Override
    public void cambiarVelocidad(Velocidad velocidad){
        if(estaEncendido && Velocidad.CERO.equals(velocidad)){
            apagar();
        } else if(!estaEncendido && !Velocidad.CERO.equals(velocidad)){
            encender(velocidad);
        } else {
            imprimir(getTipo(), "Con velocidad " + velocidad.getVelocidad());
        }
    }

    @Override
    public String getTipo(){
        return TIPO;
    }

}
