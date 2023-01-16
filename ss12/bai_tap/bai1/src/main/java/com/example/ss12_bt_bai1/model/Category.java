package com.example.ss12_bt_bai1.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import java.util.Set;


import javax.persistence.*;
@Entity
@Table(name = "category")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer category_id;

    private String name;
    @OneToMany(mappedBy = "category")
    @JsonManagedReference
    private Set<Blog> blogs;
}
