package com.example.casestudy_a04.model.employee.roles;
import com.example.casestudy_a04.model.employee.Employee;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "username",length = 45)
    private String username;

    @Column(name = "password",length = 100)
    private String password;

//    @JsonBackReference
//    @OneToMany(mappedBy = "username", cascade = CascadeType.REMOVE)
//    private List<Employee> employees;






}
