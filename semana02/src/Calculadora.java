public class Calculadora {

    
    static double promedio(int[] valores) {
        int suma = 0;
        for (int v : valores) {
            suma += v;
        }
        
        return (double) suma / valores.length; 
    }

    
    public static void main(String[] args) {
        int[] notas = {85, 90, 78, 92, 88};
        
        double resultado = promedio(notas);
        
        System.out.println("Las notas son: 85, 90, 78, 92, 88");
        System.out.println("El promedio es: " + resultado);
    }
}
