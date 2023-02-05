package com.example.demotestgeneration.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Employee {
    @Id
    @GeneratedValue(generator = "prod-generator")
    @GenericGenerator(name = "prod-generator",
            parameters = @Parameter(name = "prefix", value = "prod"),
            strategy = "com.example.demotestgeneration.model.MyGenerator")
    @Column(length = 45)
    private String id;

//    @Column(length = 45)
    private String name;

//    @Column(length = 45)
    private String birth;

    public Employee(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }
}
