package com.example.casestudy_a04.service.employee.Impl;

import com.example.casestudy_a04.model.employee.Position;
import com.example.casestudy_a04.repository.employeeRepository.IPositionRepository;
import com.example.casestudy_a04.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionService implements ITypeService<Position> {
    @Autowired
    private IPositionRepository repository;

    @Override
    public List<Position> findAll() {
        return repository.findAll();
    }
}
