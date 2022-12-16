package com.example.ss6_th_bai_21.repository;

import com.example.ss6_th_bai_21.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository  extends JpaRepository<Customer,Long> {
//    @Query("select  c from  Customer.firstName c  ")
//    Customer findCustomerByFirstNameContaining(String firstname);

//    Customer findCustomerByFirstNameContainingAndLastNameContaining()

    @Query(value = "call Insert_Customer(?1, ?2)", nativeQuery = true)
    Customer findBySP(String value1, String value2);
 }
