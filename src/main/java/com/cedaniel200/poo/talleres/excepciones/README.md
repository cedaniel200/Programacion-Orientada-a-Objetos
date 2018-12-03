# Excepciones

Una excepción es un evento, que ocurre durante la ejecución de un 
programa, que interrumpe el flujo normal de las instrucciones del 
programa. 

## El requisito de captura o especificación

Java válido debe cumplir con el requisito de captura o especificación.
Esto significa que el código que podría generar ciertas excepciones 
debe estar incluido por uno de los siguientes:

*   Una declaración try que atrapa la excepción. try debe 
proporcionar un controlador para la excepción (catch).

*   Un método que especifica que puede lanzar la excepción. 
El método debe proporcionar una cláusula throws  que enumera la 
excepción o excepciones que puede lanzar el método. 

El código que no cumple con el requisito de captura o especificación 
no se compilará.

No todas las excepciones están sujetas al requisito de captura o 
especificación. Para entender por qué, debemos observar las tres 
categorías básicas de excepciones, de las cuales solo una está 
sujeta al Requisito.

1)  **Excepción comprobada (checked exception)**
2)  **Error**
3)  **Excepción de tiempo de ejecución (RuntimeException)**