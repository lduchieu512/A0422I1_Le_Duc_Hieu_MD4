package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Truong")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Truong {
    @Id
    @Column(name = "matruong")
    private Integer maTruong;
    @Column(name = "tentruong")
    private String tenTruong;
    @Column(name = "diachi")
    private String diaChi;
    @Column(name = "soDT")
    private Integer sdt;


}
