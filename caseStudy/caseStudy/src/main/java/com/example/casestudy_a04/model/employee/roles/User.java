package com.example.casestudy_a04.model.employee.roles;
import com.example.casestudy_a04.model.employee.Employee;
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
    private String username;

    private String password;

   @OneToOne(mappedBy = "username")
    private Employee employee;






}
