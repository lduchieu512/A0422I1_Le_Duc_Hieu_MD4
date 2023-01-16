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
@Table(name = "nganh")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Nganh {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="manganh")
    private Integer maNganh;
    @Column(name = "tennganh")
    private String tenNganh;
    @Column(name = "loainganh")
    private String loaiNganh;

}
