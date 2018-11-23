package com.cedaniel200.poo.talleres.diseno.ventiladores;

import static com.cedaniel200.poo.talleres.diseno.ventiladores.Ventilador.imprimir;

public class VentiladorTechoEspecial extends VentiladorTecho {

    @Override
    public void encender(Velocidad velocidad) {
        imprimir(getTipo(), "Encendido Especial");
        super.encender(velocidad);
    }

    @Override
    public String getDescripcion() {
        return "Color: Verde - Largo Aletas: 1 metro";
    }
}
