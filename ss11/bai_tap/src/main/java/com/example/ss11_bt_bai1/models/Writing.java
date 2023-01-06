package com.example.ss11_bt_bai1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "writing  ")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Writing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tittle;
    private String content;

    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date time;



    @ManyToOne
    @JoinColumn(name = "idOfCategory")
    Category category;


}
