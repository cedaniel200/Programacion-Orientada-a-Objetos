# Herencia múltiple

## Contexto

En Java no se puede heredar de varias clases, pero el lenguaje ofrece un mecanismo para lograr un
comportamiento parecido: las interfaces. Solo se puede heredar (`extends`) de una clase, pero se
pueden implementar (`implements`) varias interfaces.

Imaginemos una aplicación con una clase `Electrodomestico` que tiene el método `prender` (para el
ejercicio no hereda de nadie ni implementa nada) y un conjunto de interfaces a nuestra disposición:

| Interfaz | Qué aporta |
|---|---|
| `AparatoElectronico` | Declara un método que devuelve el voltaje (`int`) |
| `Cosa` | Define un método que devuelve la forma (`String`) |
| `Maquina` | Define un método que devuelve una descripción (`String`) |
| `Log` | Tiene la constante `PREFIJO`, la declaración de `imprimirLog(String)` y la implementación del método estático `imprimir` |

```java
static void imprimir(String mensaje) {
    System.out.println(PREFIJO + mensaje);
}
```

## El reto

1. Crea una clase `Liquadora` que herede de `Electrodomestico` e implemente las interfaces `Cosa`,
   `AparatoElectico` y `Maquina`.
2. Crea una clase y copia en ella este código:

   ```java
   public static void main(String[] args) {
       Liquadora liquadora = new Liquadora();
       mostrarCosa(liquadora);
       mostrarAparatoElectrico(liquadora);
       mostrarMaquina(liquadora);
       mostrarElectrodomestico(liquadora);
   }

   private static void mostrarElectrodomestico(Electrodomestico electrodomestico) {
       electrodomestico.prender();
   }

   private static void mostrarMaquina(Maquina maquina) {
       imprimir("Maquina: " + maquina.getDescripcion());
   }

   private static void mostrarAparatoElectrico(AparatoElectico aparatoElectico) {
       imprimir(" Voltage -> " + aparatoElectico.getVoltage());
   }

   private static void mostrarCosa(Cosa cosa) {
       imprimir(" cosa con forma: " + cosa.getForma());
   }
   ```

   Es solo un `main` que, después de hacer los imports necesarios, debe poder ejecutarse sin ningún
   problema.

3. El método `imprimir` es el método estático de la interfaz `Log`, así que hay que importarlo con un
   `import static`:

   ```java
   import static tu.paquete.Log.imprimir;
   ```

## Solución

[`solucion`](./solucion) contiene una posible solución, con su clase `Run`. Conviene intentarlo
primero.
