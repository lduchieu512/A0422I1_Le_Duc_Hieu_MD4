package com.example.casestudy_a04.repository.customerRepository;

import com.example.casestudy_a04.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerTypeRepository extends JpaRepository< CustomerType,Integer> {
}
