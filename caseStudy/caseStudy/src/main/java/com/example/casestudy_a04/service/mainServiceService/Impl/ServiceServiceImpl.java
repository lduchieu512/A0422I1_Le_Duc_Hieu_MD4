package com.example.casestudy_a04.service.mainServiceService.Impl;

import com.example.casestudy_a04.model.MainService.MainService;
import com.example.casestudy_a04.repository.mainServiceRepository.IMainServiceRepository;
import com.example.casestudy_a04.service.mainServiceService.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceServiceImpl implements IServiceService {
    @Autowired
    private IMainServiceRepository repository;

    @Override
    public Page<MainService> findAllService(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public List<MainService> findAllList() {
        return repository.findAll();
    }

    @Override
    public void insertMainService(MainService mainService) {
        repository.save(mainService);
    }

    @Override
    public void updateMainService(MainService mainService) {
        repository.save(mainService);
    }

    @Override
    public void deleteMainService(String id) {
        repository.deleteById(id);
    }

    @Override
    public MainService selectMainService(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Page<MainService> searchService(String nameSearch, String rentTypeSearch, String typeSearch, Pageable pageable) {
        return repository.searchService("%" + nameSearch + "%", "%" + rentTypeSearch + "%", "%" + typeSearch + "%", pageable);

    }
}
