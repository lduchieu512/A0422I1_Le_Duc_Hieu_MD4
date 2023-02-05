package com.example.casestudy_a04.service.employee.Impl;

import com.example.casestudy_a04.model.employee.Position;
import com.example.casestudy_a04.repository.employeeRepository.IPositionRepository;
import com.example.casestudy_a04.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements IPositionService {
    @Autowired
    private IPositionRepository repository;

    @Override
    public List<Position> findAllPosition() {
        return repository.findAll();
    }
}
