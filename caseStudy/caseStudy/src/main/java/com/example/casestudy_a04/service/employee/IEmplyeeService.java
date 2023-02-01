package com.example.casestudy_a04.service.employee;

import com.example.casestudy_a04.model.employee.Employee;
import com.example.casestudy_a04.service.IBaseService;

import java.util.Optional;

public interface IEmplyeeService extends IBaseService<Employee> {
    Optional<Employee> findAllByUsername(String username);

}
