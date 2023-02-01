package com.example.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {


    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "stackjava.com.hibernatedemo.generator.MyGenerator")
    @Column(name="id")
    private String id;
    @Column(name = "name")
    private String name;
    // getter - setter - constructor
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

    public Employee(String name) {
        this.name = name;
    }
}
