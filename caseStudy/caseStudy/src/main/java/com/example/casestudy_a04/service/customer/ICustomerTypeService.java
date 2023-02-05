package com.example.casestudy_a04.service.customer;

import com.example.casestudy_a04.model.customer.Customer;
import com.example.casestudy_a04.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAllCustomerType();
}
