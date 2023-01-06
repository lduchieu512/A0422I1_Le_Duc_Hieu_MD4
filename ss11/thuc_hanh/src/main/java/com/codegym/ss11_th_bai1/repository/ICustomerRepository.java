package com.codegym.ss11_th_bai1.repository;

import com.codegym.ss11_th_bai1.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
