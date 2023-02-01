package com.example.demotestgeneration.service;

import com.example.demotestgeneration.model.Employee;
import com.example.demotestgeneration.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public void save(Employee employee) {
        employeeRepo.save(employee);
    }
}
