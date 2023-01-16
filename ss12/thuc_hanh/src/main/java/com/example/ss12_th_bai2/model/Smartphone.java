package com.example.ss12_th_bai2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "smartphones")
@Getter
@Setter
@NoArgsConstructor
public class Smartphone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String producer;
    private String model;
    private Double price;

    public Smartphone(String producer, String model, double price) {
        this.producer = producer;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return producer+": "+model+" with price "+price;
    }
}
