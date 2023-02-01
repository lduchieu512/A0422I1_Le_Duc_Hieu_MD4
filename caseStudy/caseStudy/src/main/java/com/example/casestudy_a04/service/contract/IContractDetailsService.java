package com.example.casestudy_a04.service.contract;

import com.example.casestudy_a04.model.contract.ContractDetail;

public interface IContractDetailsService {
    ContractDetail save(ContractDetail details);

    Iterable<ContractDetail> findAll();
}
