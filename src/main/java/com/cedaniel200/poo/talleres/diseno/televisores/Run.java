package com.cedaniel200.poo.talleres.diseno.televisores;

import static com.cedaniel200.poo.talleres.diseno.televisores.TipoEntrada.VIDEO;
import static com.cedaniel200.poo.talleres.diseno.televisores.Volumen.MEDIO;

public class Run {

    public static void main(String[] args) {
        mostrarTelevisores(new TelevisorLG());
        mostrarTelevisores(new TelevisorSamsung());
        mostrarTelevisores(new TelevisorPajarito());
    }

    private static void mostrarTelevisores(Televisor televisor) {
        System.out.println("----------------------------");
        televisor.prender();
        televisor.cambiarCanal(1);
        televisor.cambiarEntrada(VIDEO);
        televisor.cambiarVolumen(MEDIO.valor());
        televisor.apagar();
    }
}
