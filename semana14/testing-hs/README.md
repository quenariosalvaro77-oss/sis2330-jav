# Testing y Estado en Haskell

## Descripcion
Proyecto que demuestra testing automatizado con HUnit y QuickCheck, y el patron State para contar consultas sin variables mutables.

## Estructura de modulos
- `src/Notas.hs`: Funciones puras para procesar notas (promedio, masAlto, ordenarPorNota, aprobados, parsearLinea).
- `src/Historial.hs`: Patron State para contar consultas por nombre.
- `test/Spec.hs`: Suite de tests HUnit + QuickCheck.
- `app/Main.hs`: Programa principal que usa todos los modulos.

## Como correr
```bash
stack build && stack test && stack run
