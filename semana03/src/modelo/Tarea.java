package modelo;

public class Tarea {
    
    private int id;
    private String descripcion;
    private boolean completada;
    
    
    private static int contadorIds = 1;

   
    public Tarea(String descripcion) {
        this.id = contadorIds++;
        setDescripcion(descripcion);
        this.completada = false;
    }

    
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.isBlank()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía");
        }
        this.descripcion = descripcion;
    }

    // Convención 'is' para booleanos
    public boolean isCompletada() {
        return completada;
    }

    public void marcarCompletada() {
        this.completada = true;
    }

    // Método para mostrar la tarea formateada
    public void mostrar() {
        String estado = completada ? "[X]" : "[ ]";
        System.out.println(estado + " ID: " + id + " | " + descripcion);
    }
}
