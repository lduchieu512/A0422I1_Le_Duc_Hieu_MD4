package com.example.demo.service.Impl;

import com.example.demo.model.Nganh;
import com.example.demo.repos.INganhRepos;
import com.example.demo.service.INganhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class NganhServiceImpl implements INganhService {
    @Autowired
    INganhRepos nganhRepos;

    @Override
    public Iterable<Nganh> findAll() {
        return nganhRepos.findAll();
    }

    @Override
    public Optional<Nganh> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void save(Nganh nganh) {

    }

    @Override
    public void remove(Integer id) {

    }
}
