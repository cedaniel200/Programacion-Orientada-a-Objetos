# Excepción comprobada (*checked exception*)

## Qué es

Son condiciones excepcionales que una aplicación bien escrita debe anticipar y de las que debe
recuperarse. Las excepciones comprobadas están sujetas al requisito de captura o especificación.

Todas las excepciones son comprobadas, excepto las indicadas por `Error`, `RuntimeException` y sus
subclases.

## Ejemplo

- **`Lector`** muestra cómo un método debe especificar, con `throws`, la excepción o excepciones que
  puede lanzar si no las captura.
- **`Escritor`** muestra cómo un método puede capturar una excepción.

## Para ejecutarlo

```bash
./gradlew build
java -cp build/classes/java/main com.cedaniel200.poo.talleres.excepciones.checkedexception.Run
```

## Ver también

[Volver a excepciones](../README.md)
