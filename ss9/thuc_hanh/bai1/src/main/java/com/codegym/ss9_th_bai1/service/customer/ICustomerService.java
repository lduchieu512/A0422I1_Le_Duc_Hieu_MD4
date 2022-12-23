package com.codegym.ss9_th_bai1.service.customer;

import com.codegym.ss9_th_bai1.model.Customer;
import com.codegym.ss9_th_bai1.model.Province;
import com.codegym.ss9_th_bai1.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
