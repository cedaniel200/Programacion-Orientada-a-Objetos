# Inversión de dependencias: Gepetto y Pinocho

## El problema

Imagina que vemos el espectáculo de Gepetto y Pinocho y decidimos recrearlo en una pequeña
aplicación. Antes de escribir código conviene hacerse dos preguntas:

- ¿Quién sabe cómo manipular un títere?
- ¿Quién realiza la acción?

Está claro que quien sabe manipular un títere es **Gepetto** y quien realiza la acción es **Pinocho**.
Con esas dos preguntas ya podemos ver quién tiene las funciones de alto nivel y quién las de bajo
nivel.

## Responsabilidades

### Alto nivel: el titiritero

Gepetto conoce las reglas del negocio y sabe cómo manipular un títere:

```java
void mostrarTitereInmovil();
void moverCabezaDelTitere();
void moverBrazoIzquierdoDelTitere();
void moverBrazoDerechoDelTitere();
void moverPiernaIzquierdaDelTitere();
void moverPiernaDerechaDelTitere();
```

### Bajo nivel: el títere

Pinocho simplemente ejecuta las acciones que Gepetto le ordena:

```java
void inmovil();
void moverCabeza();
void moverBrazoIzquierdo();
void moverBrazoDerecho();
void moverPiernaIzquierda();
void moverPiernaDerecha();
```

## La dependencia incorrecta

La aplicación tendría dos componentes: uno de alto nivel (Gepetto) y otro de bajo nivel (Pinocho). A
estas alturas es obvio que Gepetto necesita una instancia de Pinocho para poder manipularlo.

Y ahí está el error: **el componente de alto nivel depende del de bajo nivel**. ¿Qué pasa si Pinocho se
va de vacaciones y llega Pepito Grillo? Habría que cambiar la aplicación.

Además, Gepetto no debería estar condicionado a trabajar con un solo títere: él es un titiritero y
sabe manipular a cualquier títere que le pongan. Y si quien se va de vacaciones es Gepetto, con el
diseño actual tampoco podríamos crear otro titiritero para Pinocho.

En el fondo es un **problema de abstracción**: el diseño habla de clases concretas y no de lo que
realmente son un titiritero y un títere.

## La solución: invertir la dependencia

Los conceptos principales del dominio son **titiritero** y **títere**, así que conviene abstraer su
comportamiento en dos interfaces.

1. Crea las interfaces `Titiritero` y `Titere` con las funciones ya mencionadas.
2. `Gepetto` implementa `Titiritero`, porque es un titiritero.
3. `Pinocho` implementa `Titere`.
4. `Gepetto` ya no tiene una instancia de `Pinocho`: declara una variable de tipo `Titere` y añade
   `setTitere(Titere titere)`. En un espectáculo de títeres, un titiritero puede cambiar continuamente
   de títere.

> Antes de leer el último paso, piensa la respuesta: ¿dónde deberían ir las interfaces?

5. Decide dónde van las interfaces. De su ubicación depende que se logre o no la inversión de
   dependencia: deben ir en el **componente de alto nivel**.

Ahora la aplicación puede crecer de forma más flexible: puedes crear más títeres y más titiriteros.

## Estructura de la solución

```text
titiritero/
├── capaaltonivel/    # Titiritero (interfaz), Titere (interfaz) y Gepetto
├── capabajonivel/    # Pinocho
└── Run.java
```

## Para ejecutarlo

```bash
./gradlew build
java -cp build/classes/java/main com.cedaniel200.poo.talleres.solid.inversiondependencia.titiritero.Run
```

El programa es interactivo: muestra un menú, mueve el títere según la opción elegida y termina con
`0`.
