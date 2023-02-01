package com.example.casestudy_a04.model.contract;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "contract_detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contract_detail_id;
    @ManyToOne
    @JoinColumn(name = "attach_service_id",nullable = false)
    private AttachService attachService;

    @ManyToOne
    @JoinColumn(name = "contract_id",nullable = false)
    private Contract contract;


    @Column(nullable = false)
    private Integer quantity;
}
