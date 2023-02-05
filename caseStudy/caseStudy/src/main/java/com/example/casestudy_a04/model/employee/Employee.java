package com.example.casestudy_a04.model.employee;

import com.example.casestudy_a04.model.contract.Contract;
import com.example.casestudy_a04.model.employee.roles.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

    @NotEmpty
    @Column(nullable = false, length = 45)
    private String employeeName;

    @NotNull
    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date employeeBirthday;

    @Column(nullable = false, length = 45)
    @Pattern(regexp = "[0-9]{9}|[0-9]{12}", message = "{idCard}")
    private String employeeIdCard;

    @Column(nullable = false)
    @Min(value = 0, message = "Lương phải lớn hơn 0")
    private Double employeeSalary;

    @Column(nullable = false, length = 45)
    @Pattern(regexp = "(0[9][0-9]{8})|((84)+[9][0-9]{8})",message = "{phone}")
    private String employeePhone;

    @Email( message = "{email}")
    @Column(length = 45)
    private String employeeEmail;

    @NotEmpty
    @Column(length = 45)
    private String employeeAddress;

    @ManyToOne
    @JoinColumn(name = "positionid", nullable = false)
    private Position positionId;

    @ManyToOne
    @JoinColumn(name = "educationdegreeid", nullable = false)
    private EducationDegree educationDegreeId;

    @ManyToOne
    @JoinColumn(name = "divisionid", nullable = false)
    private Division divisionId;

    @ManyToOne
    @JoinColumn(name = "username")
    private User username;

    @JsonBackReference
    @OneToMany(mappedBy = "employeeId", cascade = CascadeType.REMOVE)
    private List<Contract> contracts;
}
