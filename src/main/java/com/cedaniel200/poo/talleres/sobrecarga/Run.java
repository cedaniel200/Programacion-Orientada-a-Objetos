package com.cedaniel200.poo.talleres.sobrecarga;

import com.cedaniel200.poo.talleres.sobrecarga.solucionejercicio1.Bus;
import com.cedaniel200.poo.talleres.sobrecarga.solucionejercicio2.Suma;

public class Run {
    public static void main(String[] args) {
        ejercicioUno();
        ejercicioDos();
    }

    private static void ejercicioUno() {
        Bus busConstructorVacio = new Bus();
        System.out.println(busConstructorVacio.toString());

        Bus busConstructorConParametros = new Bus("Don Ramon", "Chavo del 8", 12);
        System.out.println(busConstructorConParametros.toString());
    }

    private static void ejercicioDos() {
        Suma suma = new Suma();
        System.out.println(suma.sumar(1, 2));
        System.out.println(suma.sumar(1, 2, 3));
        System.out.println(suma.sumar(1, 2, 3, 4));
        System.out.println(suma.sumar());
        System.out.println(suma.sumar(1));
        System.out.println(suma.sumarConStream(1, 2, 3, 4));
    }
}
