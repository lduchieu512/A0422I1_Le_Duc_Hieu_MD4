package com.example.casestudy_a04.repository.customerRepository;

import com.example.casestudy_a04.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
}
