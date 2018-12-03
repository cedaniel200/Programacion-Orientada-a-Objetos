package com.cedaniel200.poo.talleres.excepciones.runtimeexception;

public class Run {
    public static void main(String[] args) {
        Division division = new Division();
        mostrarResultadoDivision(division.dividir(10, 2));
        mostrarResultadoDivision(division.dividir(9, 3));

        // La siguiente linea genera ArithmeticException: / by zero
        // La cual es una Runtime Exception
        mostrarResultadoDivision(division.dividir(10, 0));
    }

    private static void mostrarResultadoDivision(int resultado) {
        System.out.println("Resultado : " +  resultado);
    }
}
