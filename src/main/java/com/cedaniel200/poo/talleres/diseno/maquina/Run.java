package com.cedaniel200.poo.talleres.diseno.maquina;

public class Run {

    public static void main(String[] args) {
        mostrarMaquina(new MaquinaDeAfeitar());
        mostrarMaquina(new Taladro());
        mostrarMaquina(new MaquinaPajarito());
    }

    private static void mostrarMaquina(Maquina maquina) {
        System.out.println("-------------------");
        maquina.prender();
        System.out.println( maquina.obtenerUltimaAlerta() );
        maquina.ejecutarMantenimiento();
        System.out.println("**********");
        System.out.println("  PIEZAS");
        for (Pieza pieza: maquina.obtenerPiezas()) {
            System.out.println("**********");
            System.out.println(pieza.obtenerNombre());
            System.out.println(pieza.obtenerMateriales());
            System.out.println(pieza.obtenerModoDeInstalacion());
        }
        System.out.println("**********");
        maquina.apagar();
        System.out.println("-------------------");
    }
}
