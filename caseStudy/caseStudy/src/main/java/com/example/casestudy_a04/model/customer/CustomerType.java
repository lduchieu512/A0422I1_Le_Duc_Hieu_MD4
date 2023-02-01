package com.example.casestudy_a04.model.customer;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "customer_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_type_id;

    @Column(length = 45)
    private String customer_type_name;


}
