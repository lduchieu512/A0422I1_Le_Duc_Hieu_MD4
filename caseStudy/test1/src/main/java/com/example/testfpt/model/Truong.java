package com.example.testfpt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="truong")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Truong {
    @Id
    private Integer idTruong;
    private String tenTruong;
    private String diaChi;
    private Integer sdt;


}
