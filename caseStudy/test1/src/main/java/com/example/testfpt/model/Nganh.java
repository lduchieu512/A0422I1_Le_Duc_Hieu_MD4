package com.example.testfpt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Nganh {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maNganh;

    private String tenNganh;
    private String loaiNganh;

}
