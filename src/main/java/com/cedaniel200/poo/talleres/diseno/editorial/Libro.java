package com.cedaniel200.poo.talleres.diseno.editorial;

import java.util.List;

public abstract class Libro extends Paginable implements Legible {
    public abstract String getTitulo();
    public abstract TipoLibro getTipoLibro();
    public abstract String getDedicatoria();
    public abstract String getIndiceContenido();
    public abstract List<Capitulo> getCapitulos();
    public abstract List<String> getAutores();
}
