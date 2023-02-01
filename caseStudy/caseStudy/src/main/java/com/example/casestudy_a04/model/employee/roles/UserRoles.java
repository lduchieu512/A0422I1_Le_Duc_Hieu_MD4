package com.example.casestudy_a04.model.employee.roles;

import lombok.*;

import javax.persistence.*;

@Table(name = "user_role")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "role_id",nullable = false)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "username",nullable = false)
    private User account;

}
