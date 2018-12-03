package com.cedaniel200.poo.talleres.excepciones.checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lector {

    public void leerArchivo(String ruta) throws IOException {
        String lineaTexto;
        FileReader file = new FileReader(ruta);
        BufferedReader bufferedReader = new BufferedReader(file);
        System.out.print("Leyendo: ");
        while((lineaTexto = bufferedReader.readLine())!=null) {
            System.out.println(lineaTexto);
        }
        bufferedReader.close();
    }
}
