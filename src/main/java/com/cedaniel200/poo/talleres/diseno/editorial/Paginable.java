package com.cedaniel200.poo.talleres.diseno.editorial;

public abstract class Paginable {

    public abstract void paginar();

    public abstract int getPaginaActual();

    public abstract int getUltimaPagina();

    public void pasarPaginaA(int numeroPagina){
        System.out.println("Cambiando a la pagina " + numeroPagina);
    }
}
