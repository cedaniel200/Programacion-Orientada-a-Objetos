package com.cedaniel200.poo.talleres.diseno.editorial;

import java.util.List;

public abstract class Periodico extends Paginable implements Legible {
    public abstract String getNombrePeriodico();
    public abstract Plana getPrimeraPlana();
    public abstract List<Plana> getNoticias();
}
