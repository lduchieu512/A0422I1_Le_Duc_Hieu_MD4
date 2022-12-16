package com.example.ss6_th_bai_21.service;

import com.example.ss6_th_bai_21.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer saveBySP(Customer customer);

//    Customer findCustomerByFirstNameContaining(String firstname);
}
