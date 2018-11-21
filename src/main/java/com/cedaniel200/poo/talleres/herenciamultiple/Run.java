package com.cedaniel200.poo.talleres.herenciamultiple;

import com.cedaniel200.poo.talleres.herenciamultiple.solucion.*;

import static com.cedaniel200.poo.talleres.herenciamultiple.solucion.Log.imprimir;

public class Run {
    public static void main(String[] args) {
        Liquadora liquadora = new Liquadora();
        mostrarCosa(liquadora);
        mostrarAparatoElectrico(liquadora);
        mostrarMaquina(liquadora);
        mostrarElectrodomestico(liquadora);
    }

    private static void mostrarElectrodomestico(Electrodomestico electrodomestico) {
        electrodomestico.prender();
    }

    private static void mostrarMaquina(Maquina maquina) {
        imprimir("Maquina: " + maquina.getDescripcion());
    }

    private static void mostrarAparatoElectrico(AparatoElectico aparatoElectico) {
        imprimir(" Voltage -> " + aparatoElectico.getVoltage());
    }

    private static void mostrarCosa(Cosa cosa) {
        imprimir(" cosa con forma: " + cosa.getForma());
    }
}
