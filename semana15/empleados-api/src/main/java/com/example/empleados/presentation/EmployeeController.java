package com.example.empleados.presentation;

import com.example.empleados.application.EmployeeRequest;
import com.example.empleados.application.EmployeeResponse;
import com.example.empleados.application.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public EmployeeResponse create(@RequestBody EmployeeRequest req) {
        return service.create(req);
    }

    @GetMapping("/{id}")
    public EmployeeResponse findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    public List<EmployeeResponse> findAll() {
        return service.findAll();
    }
}
