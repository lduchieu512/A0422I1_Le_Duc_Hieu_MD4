package com.example.casestudy_a04.service.mainService.Impl;

import com.example.casestudy_a04.model.MainService.MainService;
import com.example.casestudy_a04.repository.mainServiceRepository.IMainServiceRepository;
import com.example.casestudy_a04.service.mainService.IMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ServiceMainService implements IMainService {
    @Autowired
    private IMainServiceRepository repository;


    @Override
    public Page<MainService> findAllByName(String keyword, Pageable pageable) {
        return null;
    }

    @Override
    public Optional<MainService> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void save(MainService mainService) {
        repository.save(mainService);
    }

    @Override
    public void updateById(Integer id_delete) {

    }

    @Override
    public void updateMoneyById(Integer id) {

    }
}
