# Error

Son condiciones excepcionales que son externas a la aplicación y de 
las cuales la aplicación generalmente no puede anticipar o recuperar. 
Los errores no están sujetos a los requisitos de captura o 
especificación. Los errores son aquellas excepciones indicadas por 
Error y sus subclases.

## Ejemplo

La clase **Recursivo** contiene un método hacerRecursivamente, si te fijas bien
no hay ningún error de sintaxis, el código esta perfecto para el
compilador y para el IDE por lo cual no detecta posibles excepciones  o errores
y no nos obliga a capturar o especificar una posible excepción, 
pero si puede ocurrir que al trabajar con un método recursivo se desborde la pila
de llamados lo que generaría un StackOverflowError, que es en realidad lo que 
pasará si poner a ejecutar la clase Run.