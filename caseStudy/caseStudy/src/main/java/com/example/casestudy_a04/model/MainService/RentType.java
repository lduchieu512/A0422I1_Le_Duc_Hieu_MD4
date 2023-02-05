package com.example.casestudy_a04.model.MainService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "rent_type")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rentTypeId;

    @Column(length = 45)
    private String rentTypeName;

    private Double rentTypeCost;



}
