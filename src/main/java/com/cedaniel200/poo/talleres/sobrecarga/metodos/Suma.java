package com.cedaniel200.poo.talleres.sobrecarga.metodos;

import java.util.Arrays;

public class Suma {

    public int sumar(int primerNumero, int segundoNumero){
        return primerNumero + segundoNumero;
    }

    public int sumar(int primerNumero, int segundoNumero, int tercerNumero){
        return primerNumero + segundoNumero + tercerNumero;
    }

    public int sumar(int... numeros){
        int total = 0;
        for (int numero : numeros) {
            total += numero;
        }
        for (int i = 0; i < numeros.length; i++){
            total += numeros[i]; // total = total + numeros[i]
        }
        return total;
    }

    public int sumarConStream(int... numeros){
        System.out.println("Suma stream con N-parametros");
        return Arrays.stream(numeros).reduce((a, b)-> a + b).orElse(0);
    }

}
