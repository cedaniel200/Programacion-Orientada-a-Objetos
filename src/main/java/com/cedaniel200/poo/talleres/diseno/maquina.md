# Máquinas

## Objetivo

Diseñar una jerarquía de clases donde algunas operaciones se comparten y otras se sobrescriben.

## Enunciado

Estás diseñando el nuevo software para una fábrica especializada en máquinas de afeitar y en una
máquina llamada «pajarito». Debes tener en cuenta las siguientes consideraciones.

## Requisitos

- La fábrica piensa extender su mercado a cualquier otro tipo de aparato, del que se quiere conocer su
  descripción.
- Actualmente las máquinas que fabrican tienen estos comportamientos:
  - Prenderse.
  - Apagarse.
  - Ejecutar el mantenimiento (indicando si se ejecutó correctamente).
  - Conocer las piezas que componen la máquina.
  - Conocer la última alerta.
- Las máquinas que fabrica la empresa prenden y apagan todas del mismo modo.
- Las máquinas «pajarito», por diseño, deben apagarse de forma diferente.
- Cada pieza debe poder suministrar su nombre, el material del que está hecha y el modo en que se
  instala.

## Entregable

Al finalizar el diseño, implementa la máquina «taladro».

## Solución

[`maquina`](./maquina) contiene una posible solución. Conviene intentarlo primero.
