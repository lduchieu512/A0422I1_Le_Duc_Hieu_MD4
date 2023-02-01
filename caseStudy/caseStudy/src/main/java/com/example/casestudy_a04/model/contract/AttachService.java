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
    private Integer attach_service_id;
    @Column(nullable = false,length = 45)
    private String attach_service_name;
    @Column(nullable = false)
    private Double attach_service_cost;
    @Column(nullable = false)
    private Integer attach_service_unit;
    @Column(nullable = true,length = 45)
    private String attach_service_status;




}
