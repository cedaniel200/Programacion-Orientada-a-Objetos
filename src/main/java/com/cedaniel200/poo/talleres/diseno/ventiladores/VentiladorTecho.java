package com.cedaniel200.poo.talleres.diseno.ventiladores;

import static com.cedaniel200.poo.talleres.diseno.ventiladores.Ventilador.imprimir;

public abstract class VentiladorTecho implements Ventilador {

    private static final String TIPO = "Ventilador  de techo";
    private Velocidad velocidadActual = Velocidad.CERO;

    @Override
    public void encender(Velocidad velocidad){
        imprimir(getTipo(), "Encendido");
        setVelocidadActual(velocidad);
        imprimirVelocidad();
    }

    @Override
    public void apagar(){
        setVelocidadActual(Velocidad.CERO);
        imprimirVelocidad();
        imprimir(getTipo(), "Apagado");
    }

    @Override
    public void cambiarVelocidad(Velocidad velocidad){
        if(!Velocidad.CERO.equals(velocidadActual) && Velocidad.CERO.equals(velocidad)){
            apagar();
        } else if(Velocidad.CERO.equals(velocidadActual) && !Velocidad.CERO.equals(velocidad)){
            encender(velocidad);
        } else {
            setVelocidadActual(velocidad);
            imprimirVelocidad();
        }
    }

    private void imprimirVelocidad(){
        imprimir(getTipo(), "Con velocidad " + getVelocidadActual().getVelocidad());
    }

    @Override
    public String getTipo(){
        return TIPO;
    }

    private Velocidad getVelocidadActual() {
        return velocidadActual;
    }

    private void setVelocidadActual(Velocidad velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

}
