package com.cedaniel200.poo.talleres.encapsulamiento.persona;

import java.util.Random;

public class Persona {

    private static final int MINUTOS_EN_UNA_HORA = 60;
    private static final int MINIMO_DE_MINUTOS_A_DESCANSAR = 1;

    public static final char HOMBRE = 'H';
    public static final char MUJER = 'M';

    private String nombre;
    private int edad;
    private char genero;
    private boolean cansado;

    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.cansado = false;
    }

    public void correr(){
        if(verificarSiLaRopaEsAdecuada()){
            calentar();
            cansado = true;
            System.out.println("Corriendo ...");
        }
    }

    private boolean verificarSiLaRopaEsAdecuada() {
        return true;
    }

    private void calentar() {
        System.out.println("Calentando ...");
    }

    public void descansar(){
        int tiempoDescanso = calcularTiempoDescanso();
        descansarPor(tiempoDescanso);
        cansado = false;
    }

    private int calcularTiempoDescanso(){
        Random aleatorio = new Random(System.currentTimeMillis());
        return aleatorio.nextInt(MINUTOS_EN_UNA_HORA) + MINIMO_DE_MINUTOS_A_DESCANSAR;
    }

    private void descansarPor(int minutos){
        System.out.println("Descansando por " + minutos + " minutos");
    }

    public void cumplirAnios(){
        edad++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    public boolean estaCansado() {
        return cansado;
    }
}
