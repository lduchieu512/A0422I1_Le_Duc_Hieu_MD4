package com.example.casestudy_a04.model.MainService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "service")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MainService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer service_id;

    @Column(nullable = false,length = 45)
    private String service_name;

    private Integer service_area;

    @Column(nullable = false)
    private Double service_cost;

    private Integer service_max_people;

    @ManyToOne
    @JoinColumn(name = "service_type_id",nullable = false)
    private ServiceType serviceType;

    @ManyToOne
    @JoinColumn(name = "rent_type_id",nullable = false)
    private RentType rent_type;

    @Column(length = 45)
    private String standard_room;

    @Column(length = 45)
    private String description_other_convenience;

    private Double pool_area;

    private Integer number_of_floors;





}
