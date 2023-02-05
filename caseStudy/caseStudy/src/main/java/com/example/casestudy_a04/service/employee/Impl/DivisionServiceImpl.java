package com.example.casestudy_a04.service.employee.Impl;

import com.example.casestudy_a04.model.employee.Division;
import com.example.casestudy_a04.repository.employeeRepository.IDivisionRepository;
import com.example.casestudy_a04.service.employee.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements IDivisionService {
    @Autowired
    private IDivisionRepository repository;

    @Override
    public List<Division> findAllDivision() {
        return repository.findAll();
    }
}
