package com.example.casestudy_a04.service.employee.Impl;

import com.example.casestudy_a04.model.employee.EducationDegree;
import com.example.casestudy_a04.repository.employeeRepository.IEducationDegreeRepository;
import com.example.casestudy_a04.service.employee.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements IEducationDegreeService {
    @Autowired
    private IEducationDegreeRepository repository;


    @Override
    public List<EducationDegree> findAllEducationDegree() {
        return repository.findAll();
    }
}
