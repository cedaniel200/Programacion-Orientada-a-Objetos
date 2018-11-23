package com.cedaniel200.poo.talleres.encapsulamiento.persona;

import static com.cedaniel200.poo.talleres.encapsulamiento.persona.Persona.HOMBRE;

public class Run {
    public static void main(String[] args) {
        Persona persona = new Persona("Cesar", 28, HOMBRE);

        persona.cumplirAnios();
        System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años");
        System.out.println("es verdad que " + persona.getNombre() + " esta cansado " + persona.estaCansado());
        persona.correr();
        System.out.println("es verdad que " + persona.getNombre() + " esta cansado " + persona.estaCansado());
        persona.descansar();
        System.out.println("es verdad que " + persona.getNombre() + " esta cansado " + persona.estaCansado());
    }
}
