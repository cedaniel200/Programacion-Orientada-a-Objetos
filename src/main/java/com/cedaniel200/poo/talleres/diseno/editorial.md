# Editorial

## Objetivo

Modelar con abstracciones y herencia una editorial que publica libros y periódicos.

## Enunciado

Debes realizar un primer diseño para el nuevo software de una editorial, teniendo en cuenta las
siguientes consideraciones.

## Requisitos

- La editorial publica para varias empresas: libros o periódicos.
- Está especializada en tipos de libro: novela, arte y guía.
- Tanto periódicos como libros pueden leerse según un número de página.
- Ambos pueden paginar, para lo que se requiere conocer la página actual y la última; eso también les
  da la habilidad de pasar la página según un número.
- Libros y periódicos comparten la misma lógica al momento de pasar la página.
- Un libro debe permitir conocer su título, el tipo de libro, la dedicatoria, el índice de contenido,
  los capítulos (con título y contenido) y el nombre del autor o autores.
- Un periódico debe permitir conocer su nombre, su primera plana y la lista de las demás planas
  (noticias).
- Una plana contiene un encabezado, una foto, un pie de foto, un titular y la noticia.

## Entregable

Al finalizar, crea tu libro «La vida de tu_nombre» y tu periódico «Te lo cuenta tu_nombre».

## Solución

[`editorial`](./editorial) contiene una posible solución. Conviene intentarlo primero.
