# Televisores

## Objetivo

Modelar una familia de electrodomésticos donde casi todo se comparte y una marca se comporta
distinto.

## Enunciado

Te acaban de contratar en una empresa ensambladora de televisores. Debes tener en cuenta las
siguientes consideraciones.

## Requisitos

- La empresa está pensando ampliar su catálogo a otros electrodomésticos; por el momento solo se debe
  conocer la descripción de cada uno.
- Cada televisor que ensamblan prende, apaga, cambia el canal a un número determinado, cambia el
  volumen a un número determinado (100 es el máximo y cero el mínimo) y permite cambiar la entrada.
- Los tipos de entrada son video, HDMI y VGA.
- Actualmente todos los televisores (LG y Samsung) prenden y apagan de la misma forma, a excepción de
  la marca Pajarito, que apaga de forma diferente.

## Solución

[`televisores`](./televisores) contiene una posible solución. Conviene intentarlo primero.

## Para ejecutar la solución

```bash
./gradlew build
java -cp build/classes/java/main com.cedaniel200.poo.talleres.diseno.televisores.Run
```
