package com.example.casestudy_a04.service.employee.Impl;

import com.example.casestudy_a04.model.employee.EducationDegree;
import com.example.casestudy_a04.repository.employeeRepository.IEducationDegreeRepository;
import com.example.casestudy_a04.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService implements ITypeService<EducationDegree> {
    @Autowired
    private IEducationDegreeRepository repository;
    @Override
    public List<EducationDegree> findAll() {
        return repository.findAll();
    }
}
