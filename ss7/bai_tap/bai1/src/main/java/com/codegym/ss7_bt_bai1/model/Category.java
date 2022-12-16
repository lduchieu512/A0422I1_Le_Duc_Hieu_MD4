package com.codegym.ss7_bt_bai1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    @Column(name = "name_category")
    private String nameCategory;

    @OneToMany(mappedBy = "category",cascade = CascadeType.REMOVE)
    private List<Blog> blogList;


}
