package com.cedaniel200.poo.talleres.diseno.maquina;

import java.util.List;

public interface Maquina extends Aparato {
    void prender();
    void apagar();
    boolean ejecutarMantenimiento();
    List<Pieza> obtenerPiezas();
    String obtenerUltimaAlerta();
}
