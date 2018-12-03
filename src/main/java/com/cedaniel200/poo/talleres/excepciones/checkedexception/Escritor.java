package com.cedaniel200.poo.talleres.excepciones.checkedexception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escritor {

    public void escribirArchivo(String ruta, String texto){
        FileWriter fichero = null;
        try {
            fichero = new FileWriter(ruta);
            PrintWriter printWriter = new PrintWriter(fichero);
            printWriter.println(texto);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fichero != null){
                cerrarFileWriter(fichero);
            }
        }
    }

    private void cerrarFileWriter(FileWriter fichero) {
        try {
            fichero.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
