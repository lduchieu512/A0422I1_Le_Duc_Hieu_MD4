package com.example.testfpt.service;

import com.example.testfpt.model.Nganh;
import com.example.testfpt.repository.INganh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NganhService implements INganhService{
    @Autowired
    INganh service;

    @Override
    public Iterable<Nganh> findAll() {
        return service.findAll();
    }

    @Override
    public Optional<Nganh> findById(Integer id) {
        return service.findById(id);
    }

    @Override
    public void save(Nganh nganh) {
        service.save(nganh);
    }

    @Override
    public void remove(Integer id) {

    }
}
