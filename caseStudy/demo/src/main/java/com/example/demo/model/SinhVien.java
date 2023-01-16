package com.example.demo.model;

import io.micrometer.core.annotation.Counted;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sinhvien")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien {
    @Id
    @Column(name = "soCMND")
    private Integer SoCMND;
    @Column(name = "hoten")
    private String name;
    private String email;
    @Column(name = "Sodt")
    private Integer sdt;
    @Column(name = "diachi")
    private String diachi;
}
