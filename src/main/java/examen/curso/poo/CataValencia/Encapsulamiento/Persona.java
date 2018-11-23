package examen.curso.poo.CataValencia.Encapsulamiento.examen.curso.poo.CataValencia.encapsulamiento;

import java.util.Random;

public class Persona {
    private boolean estadoCivil;
    private String nombre;
    private int edad;
    private char genero;
    private boolean ropaAdecuada;
    private final static int HORA=60;
    private final static int MIN=1;

    //estoy creando el constructor sobrecargando
    public Persona(String nombre, int edad, char genero){
      //  cargar las variables de la clase en el constructor
        this.nombre=nombre;
        this.edad=edad;
        this.genero=genero;
    }

    //implementar los métodos para poder obteber en cualquier momento nombre, eddad y gemero

    public String getNombre(){
       return nombre;
      }
    public int getEdad(){
       return edad;
    }
    public char getGenero(){
      return genero;
    }

    //crea método correr
    public void correr(){
     verRopaAdecuada();
     calentar();

    }
    //crea método descansar
    public void descansar(){
        int tiempo  = calcularTiempoDescanso();
        System.out.println("Tiempo de descanso"+ tiempo);

    }
    //crea método cumplir años
    public void cumplirAños(){

    }

    private void verRopaAdecuada(){
        System.out.println("Ver ropa adecuada    ");
    }
    private void calentar(){
        System.out.println("Puede calentar");
    }

    private int calcularTiempoDescanso(){
        System.out.println("Calcular tiempo de descanso   ");
        Random aleatorio = new Random(System.currentTimeMillis());
        //return aleatorio.nextInt(System.currentTimeMillis()return aleatorio.nextInt(60)+1)
        return aleatorio.nextInt(HORA)+MIN;
    }

}
