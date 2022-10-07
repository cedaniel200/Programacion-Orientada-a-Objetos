package com.cedaniel200.poo.talleres.diseno.televisores;

public class Usuario {

    public void usarTv(Televisor televisor){
        televisor.prender();
        televisor.cambiarCanal(1);
        televisor.apagar();

        //if(televisor instanceof TelevisorPajarito)
            ((TelevisorPajarito) televisor).pingToNetwork();
    }
}
