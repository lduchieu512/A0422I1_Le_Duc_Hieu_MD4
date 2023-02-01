package com.example.casestudy_a04.model.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "education_degree")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer education_degree_id;
    @Column(nullable = true, length = 45)
    private String education_degree_name;

}
