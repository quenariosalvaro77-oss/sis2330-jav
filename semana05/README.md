# Sistema de Estudiantes Avanzado

## Descripcion
Sistema de consola que registra estudiantes y mantiene un ranking automatico por promedio.

## Por que estas estructuras
- **HashMap<String, Estudiante>**: busqueda O(1) por codigo.
- **TreeSet<Estudiante>**: ranking siempre ordenado, sin volver a ordenar manualmente en cada consulta.
- **topN devuelve ArrayList**: nunca se expone el TreeSet interno, evita que el llamador lo modifique.

## Como ejecutar
cd src
javac modelo/Estudiante.java servicio/SistemaEstudiantes.java Principal.java
java Principal

## Ejemplo de salida
1. Registrar 2.Buscar 3.Actualizar 4.Ranking 5.Top N 6.Salir
Opcion: 4
#A002 Luis (88.0)
#A003 Zoe (91.2)
#A001 Ana (95.5)
