package com.example.casestudy_a04.model.contract;

import com.example.casestudy_a04.model.customer.Customer;
import com.example.casestudy_a04.model.employee.Employee;
import com.example.casestudy_a04.model.MainService.MainService;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contract")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contract_id;

    @Column(nullable = false)
    private Date contract_start_date;

    @Column(nullable = false)
    private Date contract_end_date;

    @Column(nullable = false)
    private Double contract_deposit;

    @Column(nullable = false)
    private Double contract_total_money;

    @ManyToOne
    @JoinColumn(name = "employee_id",nullable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "service_id",nullable = false)
    private MainService service;

}
