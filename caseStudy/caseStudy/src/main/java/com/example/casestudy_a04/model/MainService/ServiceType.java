package com.example.casestudy_a04.model.MainService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "service_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer service_type_id;
    @Column(length = 45,nullable = true)
    private String service_type_name;





}
