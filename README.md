# Programación Orientada a Objetos

![Java](https://img.shields.io/badge/Java-21-blue?style=flat-square&logo=openjdk&logoColor=white)
![JUnit 5](https://img.shields.io/badge/JUnit-5.14.4-25A162?style=flat-square&logo=junit5&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-9.6.1-02303A?style=flat-square&logo=gradle&logoColor=white)
[![License: Apache 2.0](https://img.shields.io/badge/License-Apache_2.0-blue?style=flat-square)](LICENSE)

Este repositorio contiene diferentes ejercicios para practicar conceptos de programación orientada a
objetos: herencia múltiple, encapsulamiento, polimorfismo, abstracción, sobrecarga y el principio de
inversión de dependencias.

Cada taller trae su enunciado en un `.md` junto a su paquete, y en el mismo paquete una solución
propuesta. Lo recomendable es leer el enunciado, intentarlo y solo después mirar la solución.

Para una explicación de los conceptos, puedes leer
[Programación Orientada a Objetos](https://cedaniel200.blogspot.com/2018/11/programacion-orientada-objetos-poo.html).
Si tienes alguna pregunta, escribe a **cdanielmg200@gmail.com**.

## Talleres

### Diseño y abstracción

| Taller | Qué practicas |
|---|---|
| [Accesorios de cuero](src/main/java/com/cedaniel200/poo/talleres/diseno/accesorios.md) | Abstracción, interfaces y jerarquías de accesorios |
| [Editorial](src/main/java/com/cedaniel200/poo/talleres/diseno/editorial.md) | Herencia con libros y periódicos |
| [Máquinas](src/main/java/com/cedaniel200/poo/talleres/diseno/maquina.md) | Comportamiento compartido y sobrescritura |
| [Televisores](src/main/java/com/cedaniel200/poo/talleres/diseno/televisor.md) | Clases abstractas y variantes por marca |
| [Ventiladores](src/main/java/com/cedaniel200/poo/talleres/diseno/ventiladores.md) | Interfaz, clases abstractas y `@Override` paso a paso |

### Encapsulamiento

| Taller | Qué practicas |
|---|---|
| [Bombillo](src/main/java/com/cedaniel200/poo/talleres/encapsulamiento/bombillo.md) | Estado interno y métodos que lo protegen |
| [Persona](src/main/java/com/cedaniel200/poo/talleres/encapsulamiento/persona.md) | Encapsulamiento y constantes frente a números mágicos |

### Otros conceptos

| Taller | Qué practicas |
|---|---|
| [Herencia múltiple](src/main/java/com/cedaniel200/poo/talleres/herenciamultiple/herencia-multiple.md) | Interfaces como sustituto de la herencia múltiple |
| [Sobrecarga de constructores](src/main/java/com/cedaniel200/poo/talleres/sobrecarga/constructores.md) | Varios constructores para una misma clase |
| [Sobrecarga de métodos](src/main/java/com/cedaniel200/poo/talleres/sobrecarga/metodos.md) | Métodos con el mismo nombre y distintos parámetros |

### Excepciones

| Documento | Contenido |
|---|---|
| [Introducción](src/main/java/com/cedaniel200/poo/talleres/excepciones/README.md) | Qué es una excepción y el requisito de captura o especificación |
| [Checked exception](src/main/java/com/cedaniel200/poo/talleres/excepciones/checkedexception/README.md) | Excepciones que el compilador obliga a tratar |
| [Error](src/main/java/com/cedaniel200/poo/talleres/excepciones/error/README.md) | Fallos externos que no se pueden recuperar |
| [RuntimeException](src/main/java/com/cedaniel200/poo/talleres/excepciones/runtimeexception/README.md) | Errores de programación en tiempo de ejecución |

### Principios SOLID

| Taller | Qué practicas |
|---|---|
| [Inversión de dependencias](src/main/java/com/cedaniel200/poo/talleres/solid/inversiondependencia/README.md) | Gepetto, Pinocho y por qué las abstracciones van en la capa de alto nivel |

## Cómo ejecutarlo

Requiere JDK 21; el wrapper descarga Gradle 9.6.1.

```bash
./gradlew build
```

Cada taller tiene su clase `Run` (o `Main`) en el paquete del ejercicio:

```bash
java -cp build/classes/java/main com.cedaniel200.poo.talleres.<paquete>.Run
```

También puedes abrir el proyecto en IntelliJ IDEA o VS Code y ejecutar la clase desde el IDE.

## Estructura

```text
src/main/java/com/cedaniel200/poo/talleres
├── diseno/               # accesorios, editorial, máquinas, televisores y ventiladores
├── encapsulamiento/      # bombillo y persona
├── excepciones/          # checked, error y runtime
├── herenciamultiple/     # interfaces y su solución
├── sobrecarga/           # constructores y métodos
└── solid/                # inversión de dependencias
```

Cada paquete incluye su enunciado en Markdown y el código del ejercicio; en algunos casos, la solución
vive en un subpaquete `solucion`.
