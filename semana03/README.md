# Semana 03 - POO I: Gestor de Tareas

## Qué se hizo
Se construyó un Gestor de Tareas por consola aplicando los principios de la Programación Orientada a Objetos (POO). 

## Archivos
* `src/modelo/Tarea.java`: Clase modelo con encapsulación, constructores y contador autoincremental para IDs.
* `src/app/GestorTareas.java`: Clase principal con menú interactivo en bucle y `ArrayList` para gestionar las tareas.

## Cómo se ejecuta
Compilar desde la carpeta `semana03`:
```bash
javac src/modelo/Tarea.java src/app/GestorTareas.java
java -cp src app.GestorTareas
