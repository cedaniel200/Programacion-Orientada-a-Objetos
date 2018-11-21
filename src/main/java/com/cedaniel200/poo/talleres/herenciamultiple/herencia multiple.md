# Herencia Multiple

En java no tenemos la posibilidad de heredar de varias clases
pero a pesar de esto, java nos brinda un mecanismo para lograr 
un comportamiento parecido y es a través de las interfaces, es decir, 
java solo permite heredar *(extends)* de una sola clase pero podemos 
implementar *(implements)* varias interfaces.

Imaginemos que tenemos una aplicación donde existe una clase 
Electrodomestico que tiene el método prender (para efectos del 
ejercicio esta clases no hereda de ninguna otra ni implementa 
alguna interfaz), tambien tenemos un conjunto de interfaces 
dispuestas nuestra utilización, entre estas tenemos:
*   AparatoElectronico, esta interfaz declara un método que devuelte el voltage (int)
*   Cosa, esta interfaz define un método que devuelve la forma (String)
*   Maquina, esta interfaz define un método que devuelde una descripcion (String)
*   Log, Esta interfaz cuenta con la constante PREFIJO, la declaración del método 
imprimirLog el cual recibe un String, y la implementación del método static imprimir 
de la siguiente manera:

```
        static void imprimir(String mensaje){
            System.out.println(PREFIJO + mensaje);
        }
```

## Reto
1)  Tienes que crear una nueva clase llamada Liquadora que debe heredar de Electrodomestico,
e implementar de las interfaces Cosa, AparatoElectico y Maquina.
2)  Crear una clase y copiar en ella el siguiente código:

```    
        public static void main(String[] args) {
            Liquadora liquadora = new Liquadora();
            mostrarCosa(liquadora);
            mostrarAparatoElectrico(liquadora);
            mostrarMaquina(liquadora);
            mostrarElectrodomestico(liquadora);
        }
    
        private static void mostrarElectrodomestico(Electrodomestico electrodomestico) {
            electrodomestico.prender();
        }
    
        private static void mostrarMaquina(Maquina maquina) {
            imprimir("Maquina: " + maquina.getDescripcion());
        }
    
        private static void mostrarAparatoElectrico(AparatoElectico aparatoElectico) {
            imprimir(" Voltage -> " + aparatoElectico.getVoltage());
        }
    
        private static void mostrarCosa(Cosa cosa) {
            imprimir(" cosa con forma: " + cosa.getForma());
        }
```

Si no lo has notado, es solo un método main que deberia despues de hacer
todos los imports necesarios poderse ejecutar sin ningun problema. El 
metodo imprimir utilizado por ejemplo en:

```

    imprimir(" cosa con forma: " + cosa.getForma());

```

Es el método static de la interfaz Log que debe ser importado a través de un
import static, por ejemplo:

import static tu.paquete.Log.imprimir;

## Nota:
Te dejo una posible solución, puedes ejecutar el Run y ver que pasa, pero mi consejo 
es que lo intentes primero.