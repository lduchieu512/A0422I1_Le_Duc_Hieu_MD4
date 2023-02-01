package com.example.casestudy_a04.model.customer;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;

    @ManyToOne
    @JoinColumn(name = "customer_type_id",nullable = false)
    private CustomerType customerType;

    @Column(nullable = false,length = 45)
    private String customer_name;

    @Column(nullable = false)
    private Date customer_birthday;

    @Column(nullable = false)
    private Boolean customer_gender;

    @Column(nullable = false,length = 45)
    private String customer_id_card;

    @Column(nullable = false,length = 45)
    private String customer_phone;

    @Column(nullable = true,length = 45)
    private String customer_email;

    @Column(nullable = true,length = 45)
    private String customer_address;
}
