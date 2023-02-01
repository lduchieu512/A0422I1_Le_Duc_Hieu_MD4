package com.example.casestudy_a04.service.employee.Impl;

import com.example.casestudy_a04.model.employee.Employee;
import com.example.casestudy_a04.repository.employeeRepository.IEmployeeRepository;
import com.example.casestudy_a04.service.employee.IEmplyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EmployeeService implements IEmplyeeService {
    @Autowired
    private IEmployeeRepository repository;

    @Override
    public Page<Employee> findAllByName(String keyword, Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Employee> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void save(Employee employee) {
        repository.save(employee);
    }

    @Override
    public void updateById(Integer id_delete) {

    }

    @Override
    public void updateMoneyById(Integer id) {

    }

    @Override
    public Optional<Employee> findAllByUsername(String username) {
        return Optional.empty();
    }
}
