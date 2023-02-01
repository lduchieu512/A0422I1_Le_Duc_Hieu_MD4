package com.example.demotestgeneration.comtroller;

import com.example.demotestgeneration.model.Employee;
import com.example.demotestgeneration.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    EmployeeService service;

    @GetMapping("/registerStudent")
    public void registerStudent(){
        Employee employee = new Employee("join","2022-01-12");
        this.service.save(employee);
    }
}
