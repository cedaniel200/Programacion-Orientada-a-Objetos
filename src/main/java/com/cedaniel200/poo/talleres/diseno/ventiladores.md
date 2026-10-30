# Ventiladores

## Objetivo

Practicar interfaces, clases abstractas, herencia y sobrescritura de métodos.

## Ejercicio

1. Crea la interfaz `Ventilador` con estos métodos:
   - `encender`, que recibe un objeto de tipo `Velocidad`.
   - `apagar`.
   - `cambiarVelocidad`, que recibe un objeto de tipo `Velocidad`.
   - `getDescripcion`, que devuelve un `String`.

   `Velocidad` debe ser un enum con cuatro valores (`UNO`, `DOS`, `TRES` y `CUATRO`) y un método
   `getVelocidad` que devuelve un `String`.

2. Implementa la interfaz en dos clases abstractas: `VentiladorTorre` y `VentiladorTecho`. Todos los
   ventiladores de torre se encienden, apagan y cambian de velocidad igual, pero cada uno tiene una
   descripción diferente (ese método debe ser abstracto); lo mismo ocurre con los de techo. Para no
   complicar el ejercicio, cada método solo imprime un mensaje:

   ```java
   System.out.println("Mi mensaje");
   ```

   Si quieres añadir lógica, puedes hacerlo.

3. Crea dos clases por tipo de ventilador, que hereden de su clase abstracta e implementen los
   métodos necesarios.

4. Crea una clase «especial»: un tipo de ventilador de techo que no se enciende como el resto, así que
   debes sobrescribir `encender`. Pista: `@Override`.

5. Crea la clase `Main` con este código:

   ```java
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

   > El fragmento usa `CERO`, que no forma parte del enum: cámbialo por una de las cuatro
   > velocidades.

## Solución

[`ventiladores`](./ventiladores) contiene una posible solución; dentro hay una clase `Run` que puedes
ejecutar. Conviene intentarlo primero.
