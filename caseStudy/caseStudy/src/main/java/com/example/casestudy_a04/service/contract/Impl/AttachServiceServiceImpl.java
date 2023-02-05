package com.example.casestudy_a04.service.contract.Impl;

import com.example.casestudy_a04.model.contract.AttachService;
import com.example.casestudy_a04.repository.contractRepository.IAttachServiceRepository;
import com.example.casestudy_a04.service.contract.IAttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceServiceImpl implements IAttachServiceService {
    @Autowired
    private IAttachServiceRepository iAttachServiceRepository;
    @Override
    public List<AttachService> findAllAttachService() {
        return iAttachServiceRepository.findAll();
    }
}
