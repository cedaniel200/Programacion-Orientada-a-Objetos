package com.cedaniel200.poo.talleres.excepciones.checkedexception;

import java.io.IOException;

public class Run {
    public static void main(String[] args) {
        Escritor escritor = new Escritor();
        escritor.escribirArchivo("texto.txt", "Hola Mundo");

        Lector lector = new Lector();
        /*  Es necesario aplicar los bloques try - catch
            ya que el método leerArchivo solo lo especifica
            y no lo captura
         */
        try {
            lector.leerArchivo("texto.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
