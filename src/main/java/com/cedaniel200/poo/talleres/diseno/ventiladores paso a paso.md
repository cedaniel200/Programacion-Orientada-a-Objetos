**Ejercicio**

1)  Crear la Interfaz Ventilador con los siguientes métodos
    * encender este debe recibir un objeto de tipo velocidad (debe ser un enum - este enum debe tener 4 velocidades, es decir UNO, DOS, TRES y CUATRO y un metodo getVelocidad que devuelve un String)
    * apagar
    * cambiarVelocidad este debe recibir un objeto de tipo velocidad
    * getDescripcion este ultimo debe devolver un objeto String
   
2)  Implementar la interfaz en dos clases abstractas **VentiladoTorre** y **VentiladorTecho**.
tener en cuenta que todos los ventiladores de Torre se encienden, apagan y cambian de velocidad igual pero cada uno tiene una descripción diferente (este método debe ser abstracto), lo mismo ocurre con los ventiladores de techo. Para comodidad no implementaremos lógica por lo que solo imprimirán en cada método un mensaje ejemplo 
```  System.out.println("Mi mensaje");``` . Pero si quieren añadir algo de lógica lo pueden hacer.
3)  Crear 2 clases por tipo de ventilador y heredar de su respectiva clase abstracta e implementar los métodos necesarios.

4)  Crear la clase llamada especial que un tipo especial de ventilador de techo el cual no enciende (encender) de la misma manera que el resto por lo que deberás sobrescribir este método. Pista @Override

5)  Crear la clase Main con el siguiente codigo:
 ```   
        public static void main(String[] args) {
    
            // probarVentilador(Aca tu primer ventilador de torre);
            // probarVentilador(Aca tu segundo ventilador de torre);
                
            // probarVentilador(Aca tu primer ventilador de techo);
            // probarVentilador(Aca tu segundo ventilador de techo);
            // probarVentilador(Aca tu ventilador de techo especial);
        }
    
        private static void probarVentilador(Ventilador ventilador) {
    
            ventilador.encender(UNO);
            ventilador.cambiarVelocidad(DOS);
            ventilador.cambiarVelocidad(CERO);
            ventilador.cambiarVelocidad(TRES);
            ventilador.apagar();
            // Imprimir la descripcion del ventilador obteniendola a traves del metodo getDescripcion
        }
```
## Nota:
Te dejo una posible solución, puedes ejecutar el Run que esta dentro de la solución y ver
 que pasa, pero mi consejo es que lo intentes primero.