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
    @JoinColumn(nullable = false)
    private Role roleId;

    @ManyToOne
    @JoinColumn(name = "username")
    private User account;

}
