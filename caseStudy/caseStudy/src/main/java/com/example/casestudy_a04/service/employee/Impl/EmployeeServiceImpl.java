package com.example.casestudy_a04.service.employee.Impl;

import com.example.casestudy_a04.model.employee.Employee;
import com.example.casestudy_a04.repository.employeeRepository.IEmployeeRepository;
import com.example.casestudy_a04.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAllEmployee(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public List<Employee> findAllList() {
        return employeeRepository.findAll();
    }

    @Override
    public void insertEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee selectEmployee(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Employee> searchEmployee(String nameSearch, String emailSearch, String divisionSearch, Pageable pageable) {
        return employeeRepository.searchEmployee("%" + nameSearch + "%", "%" + emailSearch + "%", "%" + divisionSearch + "%", pageable);

    }
}
