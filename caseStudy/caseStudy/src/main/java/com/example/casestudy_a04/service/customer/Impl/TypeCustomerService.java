package com.example.casestudy_a04.service.customer.Impl;

import com.example.casestudy_a04.model.customer.CustomerType;
import com.example.casestudy_a04.repository.customerRepository.ICustomerTypeRepository;
import com.example.casestudy_a04.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeCustomerService implements ITypeService<CustomerType> {
    @Autowired
    private ICustomerTypeRepository repository;

    @Override
    public List<CustomerType> findAll() {
        return repository.findAll();
    }
}
