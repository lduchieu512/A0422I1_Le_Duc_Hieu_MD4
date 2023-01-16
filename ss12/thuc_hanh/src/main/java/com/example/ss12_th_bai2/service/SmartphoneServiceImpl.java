package com.example.ss12_th_bai2.service;

import com.example.ss12_th_bai2.model.Smartphone;
import com.example.ss12_th_bai2.repository.ISmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartphoneServiceImpl implements ISmartphoneService{

    @Autowired
    private ISmartphoneRepository repository ;
    @Override
    public Iterable<Smartphone> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartphone) {
        return repository.save(smartphone);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
