package com.example.casestudy_a04.model.employee;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "position")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer positionId;
    @Column(nullable = true, length = 45)
    private String positionName;
}
