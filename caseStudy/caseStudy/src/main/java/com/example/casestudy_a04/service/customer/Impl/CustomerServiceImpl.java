package com.example.casestudy_a04.service.customer.Impl;

import com.example.casestudy_a04.model.customer.Customer;
import com.example.casestudy_a04.repository.customerRepository.ICustomerRepository;
import com.example.casestudy_a04.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerRepository  repository;

    @Override
    public Page<Customer> findAllCustomer(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public List<Customer> findAllList() {
        return repository.findAll();
    }

    @Override
    public void insertCustomer(Customer customer) {
        repository.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        repository.save(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        repository.deleteById(id);
    }

    @Override
    public Customer selectCustomer(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Page<Customer> searchCustomer(String nameSearch, String emailSearch, String typeSearch, Pageable pageable) {
        return repository.searchCustomer("%" + nameSearch + "%", "%" + emailSearch + "%", "%" + typeSearch + "%", pageable);
    }
}
