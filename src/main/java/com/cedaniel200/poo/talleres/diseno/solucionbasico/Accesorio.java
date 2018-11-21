package com.cedaniel200.poo.talleres.diseno.solucionbasico;

import java.util.List;

public interface Accesorio {
    String getDescripcion();
    List<Instruccion> getInstrucciones();
    PublicoObjetivo getPublicoObjetivo();
    List<Material> getMateriales();
}
