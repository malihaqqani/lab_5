package com.example.controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.service.EmployeeService;
import com.example.model.Employee;
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService service;
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }
    @GetMapping
    public List<Employee> getEmployees() {
        return service.getAllEmployees();
    }
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }
}