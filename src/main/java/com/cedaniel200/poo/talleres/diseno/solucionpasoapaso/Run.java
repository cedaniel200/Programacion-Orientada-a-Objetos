package com.cedaniel200.poo.talleres.diseno.solucionpasoapaso;

public class Run {

    public static void main(String[] args) {

        probarVentilador(new VentiladorTorreSamurai());
        probarVentilador(new VentiladorTorreBionaire());

        probarVentilador(new VentiladorTechoKDK());
        probarVentilador(new VentiladorTechoKarluz());
        probarVentilador(new VentiladorTechoEspecial());
    }

    private static void probarVentilador(Ventilador ventilador) {
        ventilador.encender(Velocidad.UNO);
        ventilador.cambiarVelocidad(Velocidad.DOS);
        ventilador.cambiarVelocidad(Velocidad.CERO);
        ventilador.cambiarVelocidad(Velocidad.TRES);
        ventilador.cambiarVelocidad(Velocidad.CUATRO);
        ventilador.apagar();
        Ventilador.imprimir(ventilador.getTipo(), ventilador.getDescripcion());
    }

}
