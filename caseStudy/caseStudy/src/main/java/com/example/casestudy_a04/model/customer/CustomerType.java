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
    private Integer customerTypeId;

    @Column(length = 45)
    private String customerTypeName;


}
