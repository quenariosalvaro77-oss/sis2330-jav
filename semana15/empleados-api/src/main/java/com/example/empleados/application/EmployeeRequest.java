package com.example.empleados.application;

import java.math.BigDecimal;

public class EmployeeRequest {
    private String nombre;
    private String email;
    private BigDecimal salario;
    private String departamento;

    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public BigDecimal getSalario() { return salario; }
    public String getDepartamento() { return departamento; }
}
