package com.example.casestudy_a04.service.contract.Impl;

import com.example.casestudy_a04.model.contract.Contract;
import com.example.casestudy_a04.repository.contractRepository.IContractRepository;
import com.example.casestudy_a04.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImpl implements IContractService {
    @Autowired
    private IContractRepository repository;

    @Override
    public Page<Contract> findAllContract(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void insertContract(Contract contract) {
        repository.save(contract);
    }
}
