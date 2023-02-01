package com.example.casestudy_a04.service.customer.Impl;

import com.example.casestudy_a04.model.customer.Customer;
import com.example.casestudy_a04.repository.customerRepository.ICustomerRepository;
import com.example.casestudy_a04.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository repository;
    @Override
    public Page<Customer> findAllByName(String keyword, Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }

    @Override
    public void updateById(Integer id_delete) {

    }

    @Override
    public void updateMoneyById(Integer id) {

    }
}
