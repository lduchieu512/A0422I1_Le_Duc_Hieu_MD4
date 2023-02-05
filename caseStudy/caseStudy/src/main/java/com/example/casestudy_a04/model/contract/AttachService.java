package com.example.casestudy_a04.model.contract;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "attach_service")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer attachServiceId;
    @Column(nullable = false,length = 45)
    private String attachServiceName;
    @Column(nullable = false)
    private Double attachServiceCost;
    @Column(nullable = false,length = 45)
    private String attachServiceUnit;
    @Column(nullable = true,length = 45)
    private String attachServiceStatus;




}
