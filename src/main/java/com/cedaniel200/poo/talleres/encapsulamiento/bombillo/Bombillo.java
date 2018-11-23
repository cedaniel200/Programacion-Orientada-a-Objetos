package com.cedaniel200.poo.talleres.encapsulamiento.bombillo;

public class Bombillo {

    private boolean prendido;

    public Bombillo() {
        this.prendido = false;
    }

    public void prender(){
        if(noEstaPrendido()){
            cerrarCircuito();
            cargarBombillo();
            prenderBombillo();
        }
    }

    private boolean noEstaPrendido() {
        return !estaPrendido();
    }

    private void cerrarCircuito() {
        System.out.println("cerrarCircuito");
    }

    private void cargarBombillo() {
        System.out.println("cargarBombillo");
    }

    private void prenderBombillo(){
        System.out.println("prenderBombillo");
        // ...
        prendido = true;
    }

    public void apagar(){
        if(estaPrendido()){
            abrirCircuito();
            descargarBombillo();
            apagarBombillo();
        }
    }

    public boolean estaPrendido() {
        return prendido;
    }

    private void abrirCircuito(){
        System.out.println("abrirCircuito");
    }

    private void descargarBombillo(){
        System.out.println("descargarBombillo");
    }

    private void apagarBombillo() {
        System.out.println("apagarBombillo");
        // ...
        prendido = false;
    }
}
