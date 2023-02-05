package com.example.casestudy_a04.service.contract;

import com.example.casestudy_a04.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService {
    Page<Contract> findAllContract(Pageable pageable);
    void insertContract(Contract contract);
}
