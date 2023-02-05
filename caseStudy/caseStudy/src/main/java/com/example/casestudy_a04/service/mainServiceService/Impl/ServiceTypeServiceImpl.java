package com.example.casestudy_a04.service.mainServiceService.Impl;

import com.example.casestudy_a04.model.MainService.ServiceType;
import com.example.casestudy_a04.repository.mainServiceRepository.IServiceTypeRepository;
import com.example.casestudy_a04.service.mainServiceService.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements IServiceTypeService {
    @Autowired
    private IServiceTypeRepository repository;

    @Override
    public List<ServiceType> findAllTypeService() {
        return repository.findAll();
    }
}
