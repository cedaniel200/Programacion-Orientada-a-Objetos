package com.cedaniel200.poo.talleres.diseno.televisores;

public interface Televisor extends Electrodomestico {
    void prender();
    void apagar();
    void cambiarCanal(int canal);
    void cambiarVolumen(int volumen);
    void cambiarEntrada(TipoEntrada tipoEntrada);
}
