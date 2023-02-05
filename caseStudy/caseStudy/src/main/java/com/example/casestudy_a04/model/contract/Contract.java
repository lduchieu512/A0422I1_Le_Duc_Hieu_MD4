package com.example.casestudy_a04.model.contract;

import com.example.casestudy_a04.model.customer.Customer;
import com.example.casestudy_a04.model.employee.Employee;
import com.example.casestudy_a04.model.MainService.MainService;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "contract")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contractId;

    @NotNull
    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date contractStartDate;

    @NotNull
    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date contractEndDate;

    @Column(nullable = false)
    @Min(value = 0, message = "  Không được bé hơn 0.  ")
    private Double contractDeposit;

    @Column(nullable = false)
    @Min(value = 0, message = "  Không được bé hơn 0.  ")
    private Double contractTotalMoney;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "employee_id",nullable = false)
    private Employee employeeId;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customerId;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "service_id",nullable = false)
    private MainService serviceId;

    @JsonBackReference
    @OneToMany(mappedBy = "serviceId", cascade = CascadeType.REMOVE)
    private List<Contract> contracts;
}
