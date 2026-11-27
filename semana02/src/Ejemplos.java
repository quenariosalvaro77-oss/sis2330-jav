import java.util.Scanner;

public class Ejemplos {
    public static void main(String[] args) {
        
        System.out.println("--- Iniciando pruebas de la Semana 2 ---");

        // 1. Variables y tipos primitivos
        int edad = 20;
        double promedio = 85.5;
        boolean aprobado = true;
        char inicial = 'J';
        
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);

        // 2. División (¡Ojo aquí!)
        System.out.println("7 / 2 = " + (7 / 2)); // Esto dará 3
        System.out.println("7.0 / 2 = " + (7.0 / 2)); // Esto dará 3.5

        // 3. Condicionales
        if (promedio >= 70 && aprobado) {
            System.out.println("El estudiante pasó.");
        }
    }
}
