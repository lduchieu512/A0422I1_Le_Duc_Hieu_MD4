package com.example.casestudy_a04.service.mainService.Impl;

import com.example.casestudy_a04.model.MainService.RentType;
import com.example.casestudy_a04.repository.mainServiceRepository.IRentTypeRepository;
import com.example.casestudy_a04.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceRentService implements ITypeService<RentType> {
    @Autowired
    private IRentTypeRepository repository;

    @Override
    public List<RentType> findAll() {
        return repository.findAll();
    }
}
