package com.example.casestudy_a04.service.contract.Impl;

import com.example.casestudy_a04.model.contract.AttachService;
import com.example.casestudy_a04.repository.contractRepository.IAttachServiceRepository;
import com.example.casestudy_a04.service.contract.IServiceAttachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceAttachService implements IServiceAttachService {
    @Autowired
    private IAttachServiceRepository repository;
    @Override
    public Optional<AttachService> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<AttachService> findAll() {
        return repository.findAll();
    }
}
