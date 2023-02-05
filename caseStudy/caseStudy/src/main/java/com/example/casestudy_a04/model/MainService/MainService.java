package com.example.casestudy_a04.model.MainService;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "service")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MainService {
    @Id
    @GeneratedValue(generator = "prod-generator")
    @GenericGenerator(name = "prod-generator",
            parameters = @org.hibernate.annotations.Parameter(name = "prefix", value = "DV"),
            strategy = "com.example.casestudy_a04.model.MyGenerator")
    @Column(length = 45)
    private String serviceId;
    @NotEmpty
    @Column(nullable = false,length = 45)
    private String serviceName;

    @Min(value = 0, message = "Diện tích phải lớn hơn 0")
    private Integer serviceArea;

    @Column(nullable = false)
    @Min(value = 0, message = "Giá phải lớn hơn 0")
    private Double serviceCost;

    @Min(value = 0, message = "Số lượng người phải lớn hơn 0")
    private Integer serviceMaxPeople;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "service_type_id",nullable = false)
    private ServiceType serviceTypeId;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "rent_type_id",nullable = false)
    private RentType rentTypeId;

    @NotEmpty
    @Column(length = 45)
    private String standardRoom;

    @NotEmpty
    @Column(length = 45)
    private String descriptionOtherConvenience;

    @Min(value = 0, message = "Lớn hơn 0")
    private Double poolArea;

    @Min(value = 0, message = "Số tầng phải là số nguyên dương")
    private Integer numberOfFloors;





}
