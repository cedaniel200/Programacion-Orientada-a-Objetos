# Excepción de tiempo de ejecución (*RuntimeException*)

## Qué es

Son condiciones excepcionales internas a la aplicación, que esta generalmente no puede anticipar ni
recuperar. Suelen indicar errores de programación: fallos lógicos o un uso incorrecto de una API. Las
excepciones de tiempo de ejecución **no** están sujetas al requisito de captura o especificación: son
las indicadas por `RuntimeException` y sus subclases.

## Ejemplo

La clase **`Division`** contiene un método `dividir`. Si te fijas bien, no hay ningún error de
sintaxis: el código está perfecto para el compilador y para el IDE, que no detectan posibles
excepciones y no obligan a capturar ni a especificar nada.

Pero en tiempo de ejecución sí puede ocurrir que se intente dividir por cero, lo que genera un
`ArithmeticException`.

Otra excepción de este tipo muy habitual es `NullPointerException`.

## Para ejecutarlo

```bash
./gradlew build
java -cp build/classes/java/main com.cedaniel200.poo.talleres.excepciones.runtimeexception.Run
```

## Ver también

[Volver a excepciones](../README.md)
