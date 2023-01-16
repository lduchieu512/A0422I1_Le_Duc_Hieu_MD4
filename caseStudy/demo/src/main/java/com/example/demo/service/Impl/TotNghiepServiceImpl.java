package com.example.demo.service.Impl;

import com.example.demo.model.TotNghiep;
import com.example.demo.repos.ITotNghiepRepos;
import com.example.demo.service.ITotNghiepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class TotNghiepServiceImpl implements ITotNghiepService {
    @Autowired
    ITotNghiepRepos iTotNghiepRepos;

    @Override
    public Iterable<TotNghiep> findAll() {
        return iTotNghiepRepos.findAllTotNghiep();
    }

    @Override
    public Optional<TotNghiep> findById(Integer id) {
        return iTotNghiepRepos.findById(id);
    }

    @Override
    public void save(TotNghiep totNghiep) {
        iTotNghiepRepos.save(totNghiep);
    }

    @Override
    public void remove(Integer id) {
        iTotNghiepRepos.deleteById(id);
    }
}
