# Encapsulamiento: persona

## Objetivo

Conocer y entender la capacidad de los objetos de ocultar su estado y su comportamiento.

## Enunciado

Debes diseñar una clase llamada `Persona` que pueda correr, descansar, cumplir años y permita conocer
si está cansada o no.

## Requisitos

- Al crear una persona se debe poder indicar su nombre (`String`), su edad (`int`) y su género
  (`char`).
- La clase expone los posibles valores de género: hombre (`M`) y mujer (`F`).
- En cualquier momento se debe poder consultar el nombre, la edad y el género.
- **Correr**
  - Antes de correr se comprueba si se tiene la ropa adecuada; si la tiene, puede correr.
  - Si puede correr, primero debe calentar para evitar problemas musculares.
- **Descansar**
  - Antes de descansar se calcula el tiempo de descanso con este código:

    ```java
    Random aleatorio = new Random(System.currentTimeMillis());
    return aleatorio.nextInt(60) + 1;
    ```

  - Después se descansa durante ese tiempo.
- **Cumplir años**

  Debe aumentar la edad en uno (`edad++`).

## Reto extra

Al terminar, «Sonar» avisa de que hay **números mágicos**: los números `60` y `1` de la fórmula deben
pasar a constantes. Ten en cuenta que `60` son los minutos de una hora y `1` es la cantidad mínima de
minutos que se desea descansar.

## Solución

[`persona`](./persona) contiene una posible solución. Conviene intentarlo primero.
