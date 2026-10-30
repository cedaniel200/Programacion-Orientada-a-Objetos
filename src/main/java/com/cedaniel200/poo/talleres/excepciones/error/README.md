# Error

## Qué es

Son condiciones excepcionales externas a la aplicación, que esta generalmente no puede anticipar ni
recuperar. Los errores **no** están sujetos al requisito de captura o especificación: son las
excepciones indicadas por `Error` y sus subclases.

## Ejemplo

La clase **`Recursivo`** contiene un método `hacerRecursivamente`. Si te fijas bien, no hay ningún
error de sintaxis: el código está perfecto para el compilador y para el IDE, que no detectan posibles
excepciones y no obligan a capturar ni a especificar nada.

Aun así, al trabajar con un método recursivo se puede desbordar la pila de llamadas y generar un
`StackOverflowError`, que es justo lo que pasa si ejecutas la clase `Run`.

## Para ejecutarlo

```bash
./gradlew build
java -cp build/classes/java/main com.cedaniel200.poo.talleres.excepciones.error.Run
```

## Ver también

[Volver a excepciones](../README.md)
