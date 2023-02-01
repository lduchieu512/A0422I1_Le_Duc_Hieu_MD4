package com.example.casestudy_a04.service.contract.Impl;

import com.example.casestudy_a04.model.contract.ContractDetail;
import com.example.casestudy_a04.repository.contractRepository.IContractDetailRepository;
import com.example.casestudy_a04.service.contract.IContractDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractDetailsService implements IContractDetailsService {

    @Autowired
    private IContractDetailRepository repository;

    @Override
    public ContractDetail save(ContractDetail details) {
        return repository.save(details);
    }

    @Override
    public Iterable<ContractDetail> findAll() {
        return repository.findAll();
    }
}
