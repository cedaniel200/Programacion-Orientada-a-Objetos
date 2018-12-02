package com.cedaniel200.poo.talleres.solid.inversiondependencia.titiritero;

import com.cedaniel200.poo.talleres.solid.inversiondependencia.titiritero.capaaltonivel.Gepetto;
import com.cedaniel200.poo.talleres.solid.inversiondependencia.titiritero.capaaltonivel.Titere;
import com.cedaniel200.poo.talleres.solid.inversiondependencia.titiritero.capaaltonivel.Titiritero;
import com.cedaniel200.poo.talleres.solid.inversiondependencia.titiritero.capabajonivel.Pinocho;

import java.util.Scanner;

public class Run {

    public static final int MOVER_CABEZA = 1;
    public static final int MOVER_BRAZO_IZQUIERDO = 2;
    public static final int MOVER_BRAZO_DERECHO = 3;
    public static final int MOVER_PIERNA_INZQUIERDA = 4;
    public static final int MOVER_PIERNA_DERECHA = 5;
    private static Titere pinocho = new Pinocho();
    private static Titiritero gepeto = new Gepetto(pinocho);

    public static void main(String[] args) {
        Scanner scannerParaDatosEntrada = new Scanner(System.in);
        int movimientoSeleccionado = 0;

        gepeto.mostrarTitereInmovil();
        do{
            mostrarMenu();
            movimientoSeleccionado = scannerParaDatosEntrada.nextInt();
            moverTitereSegun(movimientoSeleccionado);
            System.out.println("-----------------");
        }while (movimientoSeleccionado != 0);
    }

    private static void moverTitereSegun(int movimientoSeleccionado) {
        if(movimientoSeleccionado == MOVER_CABEZA){
            gepeto.moverCabezaDelTitere();
        }else if(movimientoSeleccionado == MOVER_BRAZO_IZQUIERDO){
            gepeto.moverBrazoIzquierdoDelTitere();
        }else if(movimientoSeleccionado == MOVER_BRAZO_DERECHO){
            gepeto.moverBrazoDerechoDelTitere();
        }else if(movimientoSeleccionado == MOVER_PIERNA_INZQUIERDA){
            gepeto.moverPiernaIzquierdoDelTitere();
        }else if(movimientoSeleccionado == MOVER_PIERNA_DERECHA){
            gepeto.moverPiernaDerechoDelTitere();
        }
    }

    private static void mostrarMenu() {
        System.out.println("1. Mover cabeza");
        System.out.println("2. Mover brazo izquierdo");
        System.out.println("3. Mover brazo derecho");
        System.out.println("4. Mover pierna izquierda");
        System.out.println("5. Mover pierna derecha");
        System.out.println("0. Salir");
    }
}
