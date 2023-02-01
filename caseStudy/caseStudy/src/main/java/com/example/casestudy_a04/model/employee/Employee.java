package com.example.casestudy_a04.model.employee;

import com.example.casestudy_a04.model.employee.roles.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    @Column(nullable = false,length = 45)
    private String employeeName;

    @Column(nullable = false)
    private Date employeeBirthday;

    @Column(nullable = false,length = 45)
    private String employeeCard;

    @Column(nullable = false)
    private Double employeeSalary;

    @Column(nullable = false,length = 45)
    private String employeePhone;

    @Column(nullable = true,length = 45)
    private String employeeEmail;
    @Column(nullable = true,length = 45)
    private String employeeAddress;

    @ManyToOne
    @JoinColumn(name = "position_id",nullable = false)
    private Position position;

    @ManyToOne
    @JoinColumn(name = "division_id",nullable = false)
    private Division divisionId;

    @ManyToOne
    @JoinColumn(name = "education_degree_id",nullable = false)
    private EducationDegree educationDegree;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "username")
    private User username;
}
