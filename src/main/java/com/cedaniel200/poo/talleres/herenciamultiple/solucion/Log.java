package com.cedaniel200.poo.talleres.herenciamultiple.solucion;

public interface Log {

    String PREFIJO = "LOG: ";

    void imprimirLog(String mensaje);

    static void imprimir(String mensaje){
        System.out.println(PREFIJO + mensaje);
    }
}
