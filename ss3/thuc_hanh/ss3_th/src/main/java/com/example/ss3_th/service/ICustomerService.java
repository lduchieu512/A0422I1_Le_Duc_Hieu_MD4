package com.example.ss3_th.service;

import com.example.ss3_th.model.Customer;

import java.util.List;

public interface ICustomerService {
    //các phương thức sẽ sử dụng trong controller.
    List<Customer> findAll();
    void save(Customer customer);
    Customer findById(int id);
    void update(int id,Customer customer);
    void remote(int id);
}
