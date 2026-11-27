package app;

import modelo.Tarea;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorTareas {
    public static void main(String[] args) {
        ArrayList<Tarea> tareas = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- GESTOR DE TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1:
                        System.out.print("Descripción de la tarea: ");
                        String desc = scanner.nextLine();
                        tareas.add(new Tarea(desc));
                        System.out.println("¡Tarea agregada!");
                        break;
                    case 2:
                        System.out.println("\n--- LISTA DE TAREAS ---");
                        if (tareas.isEmpty()) {
                            System.out.println("No hay tareas.");
                        } else {
                            for (Tarea t : tareas) {
                                t.mostrar();
                            }
                        }
                        break;
                    case 3:
                        System.out.print("ID de la tarea a completar: ");
                        int idCompletar = scanner.nextInt();
                        for (Tarea t : tareas) {
                            if (t.getId() == idCompletar) {
                                t.marcarCompletada();
                                System.out.println("Tarea marcada como completada.");
                                break;
                            }
                        }
                        break;
                    case 4:
                        System.out.print("ID de la tarea a eliminar: ");
                        int idEliminar = scanner.nextInt();
                        
                        boolean eliminado = tareas.removeIf(t -> t.getId() == idEliminar);
                        if (eliminado) {
                            System.out.println("Tarea eliminada.");
                        } else {
                            System.out.println("No se encontró la tarea con ese ID.");
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo del gestor...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (Exception e) { 
                System.out.println("Error: Por favor, ingresa un número válido.");
                scanner.nextLine(); 
                opcion = 0; 
            }
        } while (opcion != 5);
        
        scanner.close();
    }
}
