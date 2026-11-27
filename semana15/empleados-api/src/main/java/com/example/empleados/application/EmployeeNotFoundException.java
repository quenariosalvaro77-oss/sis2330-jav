package com.example.empleados.application;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Empleado no encontrado con id: " + id);
    }
}
