package com.example.casestudy_a04.service.mainService.Impl;

import com.example.casestudy_a04.model.MainService.ServiceType;
import com.example.casestudy_a04.repository.mainServiceRepository.IServiceTypeRepository;
import com.example.casestudy_a04.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceTypeService implements ITypeService<ServiceType> {
    @Autowired
    private IServiceTypeRepository repository;

    @Override
    public List<ServiceType> findAll() {
        return repository.findAll();
    }
}
