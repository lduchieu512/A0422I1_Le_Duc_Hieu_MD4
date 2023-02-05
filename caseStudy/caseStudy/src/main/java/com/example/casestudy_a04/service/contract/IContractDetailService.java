package com.example.casestudy_a04.service.contract;

import com.example.casestudy_a04.model.contract.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    List<ContractDetail> findAllContractDetail();
    void insert(ContractDetail contractDetail);

}
