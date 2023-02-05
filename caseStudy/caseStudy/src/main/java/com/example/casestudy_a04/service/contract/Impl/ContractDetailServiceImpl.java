package com.example.casestudy_a04.service.contract.Impl;

import com.example.casestudy_a04.model.contract.ContractDetail;
import com.example.casestudy_a04.repository.contractRepository.IContractDetailRepository;
import com.example.casestudy_a04.repository.contractRepository.IContractRepository;
import com.example.casestudy_a04.service.contract.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContractDetailServiceImpl implements IContractDetailService {
    @Autowired
    private IContractDetailRepository repository;

    @Override
    public List<ContractDetail> findAllContractDetail() {
        return repository.findAll();
    }

    @Override
    public void insert(ContractDetail contractDetail) {
        repository.save(contractDetail);
    }
}
