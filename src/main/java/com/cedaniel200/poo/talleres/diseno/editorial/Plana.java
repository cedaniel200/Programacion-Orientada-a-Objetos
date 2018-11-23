package com.cedaniel200.poo.talleres.diseno.editorial;

import java.io.File;

public class Plana {

    private String encabezado;
    private File foto;
    private String pieDeFoto;
    private String titularNoticia;
    private String noticia;

    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public File getFoto() {
        return foto;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }

    public String getPieDeFoto() {
        return pieDeFoto;
    }

    public void setPieDeFoto(String pieDeFoto) {
        this.pieDeFoto = pieDeFoto;
    }

    public String getTitularNoticia() {
        return titularNoticia;
    }

    public void setTitularNoticia(String titularNoticia) {
        this.titularNoticia = titularNoticia;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }
}
