package com.cedaniel200.poo.talleres.diseno.televisores;

public enum Volumen {

    BAJO(10),
    MEDIO(50),
    TODO_EL_VOLUMEN(100);

    private int valor;

    Volumen(int valor) {
        this.valor = valor;
    }

    public int valor() {
        return this.valor;
    }
}
