# Excepciones

Una excepción es un evento que ocurre durante la ejecución de un programa y que interrumpe el flujo
normal de sus instrucciones.

## El requisito de captura o especificación

El código Java válido debe cumplir el requisito de captura o especificación: el código que podría
generar ciertas excepciones debe estar cubierto por una de estas dos opciones.

- Una declaración `try` que atrape la excepción. El `try` debe proporcionar un manejador para la
  excepción (`catch`).
- Un método que especifique que puede lanzar la excepción. El método debe proporcionar una cláusula
  `throws` que enumere la excepción o excepciones que puede lanzar.

El código que no cumple este requisito no compila.

No todas las excepciones están sujetas al requisito. Para entender por qué hay que mirar las tres
categorías básicas, de las cuales solo una está sujeta:

1. [Excepción comprobada (*checked exception*)](checkedexception/README.md)
2. [Error](error/README.md)
3. [Excepción de tiempo de ejecución (*RuntimeException*)](runtimeexception/README.md)
