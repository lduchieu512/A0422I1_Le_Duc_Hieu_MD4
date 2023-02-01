package com.example.casestudy_a04.service.contract.Impl;

import com.example.casestudy_a04.model.contract.Contract;
import com.example.casestudy_a04.repository.contractRepository.IContractRepository;
import com.example.casestudy_a04.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository repository;
    @Override
    public Page<Contract> findAllByName(String keyword, Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Contract> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void save(Contract contract) {
        repository.save(contract);
    }

    @Override
    public void updateById(Integer id_delete) {

    }

    @Override
    public void updateMoneyById(Integer id) {

    }
}
