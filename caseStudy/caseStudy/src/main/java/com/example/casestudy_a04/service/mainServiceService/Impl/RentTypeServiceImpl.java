package com.example.casestudy_a04.service.mainServiceService.Impl;

import com.example.casestudy_a04.model.MainService.RentType;
import com.example.casestudy_a04.repository.mainServiceRepository.IRentTypeRepository;
import com.example.casestudy_a04.repository.mainServiceRepository.IServiceTypeRepository;
import com.example.casestudy_a04.service.mainServiceService.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class RentTypeServiceImpl implements IRentTypeService {
    @Autowired
    private IRentTypeRepository repository;

    @Override
    public List<RentType> findAllRentType() {
        return repository.findAll();
    }
}
