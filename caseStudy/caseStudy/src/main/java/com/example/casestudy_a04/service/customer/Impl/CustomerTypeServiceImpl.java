package com.example.casestudy_a04.service.customer.Impl;

import com.example.casestudy_a04.model.customer.CustomerType;
import com.example.casestudy_a04.repository.customerRepository.ICustomerTypeRepository;
import com.example.casestudy_a04.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository repository;
    @Override
    public List<CustomerType> findAllCustomerType() {
        return repository.findAll();
    }
}
