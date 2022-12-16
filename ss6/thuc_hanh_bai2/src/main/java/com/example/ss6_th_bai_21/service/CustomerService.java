package com.example.ss6_th_bai_21.service;

import com.example.ss6_th_bai_21.model.Customer;
import com.example.ss6_th_bai_21.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveBySP(Customer customer) {
        return customerRepository.findBySP(customer.getFirstName(),customer.getLastName());
    }


}
