package com.example.casestudy_a04.service.contract;

import com.example.casestudy_a04.model.contract.AttachService;

import java.util.List;
import java.util.Optional;


public interface IServiceAttachService {
    Optional<AttachService> findById(Integer id);

    List<AttachService> findAll();
}
