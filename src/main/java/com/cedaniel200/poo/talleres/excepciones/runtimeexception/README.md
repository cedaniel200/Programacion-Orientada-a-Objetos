# Excepción de tiempo de ejecución (RuntimeException)

Son condiciones excepcionales que son internas a la aplicación y de 
las cuales la aplicación generalmente no puede anticipar o recuperar. 
Estos suelen indicar errores de programación, como errores lógicos o 
uso incorrecto de una API. Las excepciones de tiempo de ejecución no 
están sujetas al requisito de captura o especificación. 
Las excepciones de tiempo de ejecución son aquellas indicadas por 
RuntimeException y sus subclases.

## Ejemplo

La clase **División** contiene un método dividir, si te fijas bien
no hay ningún error de sintaxis, el código esta perfecto para el
compilador y para el IDE por lo cual no detecta posibles excepciones 
y no nos obliga a capturar o especificar una posible excepción, 
pero obviamente en tiempo de ejecución si puede ocurrir que tratemos 
de dividir por 0 lo que generaría un ArithmeticException.

Otra excepción del tipo RuntimeException muy habitual es el 
NullPointerException.