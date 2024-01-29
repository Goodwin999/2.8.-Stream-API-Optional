package com.example.Stream.API.controller;

import com.example.Stream.API.dto.Employee;
import com.example.Stream.API.service.EmployeeService;
import com.example.Stream.API.util.EmployeeNameValidator;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestParam String firstName, @RequestParam String lastName,
                                @RequestParam int department, @RequestParam double salary) {
        EmployeeNameValidator.checkNames(firstName, lastName);
        return employeeService.addEmployee(firstName, lastName, department, salary);
    }

    @DeleteMapping("/remove")
    public Employee removeEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        EmployeeNameValidator.checkNames(firstName, lastName);
        return employeeService.removeEmployee(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        EmployeeNameValidator.checkNames(firstName, lastName);
        return employeeService.findEmployee(firstName, lastName);
    }

    @GetMapping("/all")
    public Collection<Employee> printAll() {
        return employeeService.printAll();
    }
}
