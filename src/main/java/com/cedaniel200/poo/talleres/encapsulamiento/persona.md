# Encapsulamiento

## Objetivo: 
Conocer y entender la capacidad de los objetos de ocultar su
estado y comportamiento.

## Descripción:

Debes diseñar una clase llamada Persona el cual puede correr,  descansar, cumplir años y 
conocer si está cansado o no. 

Se debe tener las siguientes consideraciones:

*   Al momento de crear un objeto persona debo poder especificar su nombre (String), edad (int) 
y género (char).
*   Esta clase permite exponer los posibles valores para el genero (Hombre M o Mujer F). 
*   En cualquier momento yo quiero poder saber su nombre, edad o género.
*   Correr:  
    *   Antes de correr se debe verificar si se tiene la ropa adecuada, en caso de ser así, si puede correr.
    *   En caso de poder correr antes se debe calentar, para evitar cualquier problema muscular.
*   Descansar: 
    *   Antes de descansar se debe calcular el tiempo de descanso para ello utilizamos el siguiente código:

```
Random aleatorio = new Random(System.currentTimeMillis());
return aleatorio.nextInt(60) + 1;
```

*   Luego se procede a descansar por el tiempo de descanso.
*   Cumplir Años: Debe aumentar en 1 la edad (edad++).

Al terminar de implementar, sonar nos dice que tenemos números mágicos por lo que debemos llevar a 
constantes los números 60 y 1 de la fórmula. Para esto tenga en cuenta que el 60 representa los 
minutos de una hora y el 1 la cantidad de minutos mínimo que se desea descansar.

## Nota:
Te dejo una posible solución, pero mi consejo es que lo intentes primero.
