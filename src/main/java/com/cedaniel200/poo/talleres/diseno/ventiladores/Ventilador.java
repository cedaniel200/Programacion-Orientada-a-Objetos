package com.cedaniel200.poo.talleres.diseno.ventiladores;

public interface Ventilador {
    void encender(Velocidad velocidad);
    void apagar();
    void cambiarVelocidad(Velocidad velocidad);
    String getDescripcion();
    String getTipo();

    static void imprimir(String tipo, String mensaje){
        System.out.println(tipo + " - " + mensaje);
    }
}

