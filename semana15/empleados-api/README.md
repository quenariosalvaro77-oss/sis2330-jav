# API de Empleados - Clean Architecture

## Descripcion
API REST construida con Spring Boot y JPA, organizada con Clean Architecture y DDD, donde las dependencias solo apuntan hacia el dominio.

## Decision de diseno
El dominio no importa JPA ni Spring. La interfaz `EmployeeRepository` vive en dominio, y su implementacion (`JpaEmployeeRepository`) en infraestructura. Esto invierte la dependencia: el dominio dicta el contrato y la infraestructura lo cumple.

## Como compilar y correr

mvn clean test
mvn spring-boot:run
curl http://localhost:8080/api/empleados
