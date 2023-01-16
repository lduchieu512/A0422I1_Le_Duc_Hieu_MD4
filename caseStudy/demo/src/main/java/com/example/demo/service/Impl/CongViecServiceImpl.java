package com.example.demo.service.Impl;

import com.example.demo.model.CongViec;
import com.example.demo.repos.ICongViecRepos;
import com.example.demo.service.ICongViecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Optional;
@Service
public class CongViecServiceImpl implements ICongViecService {

    @Autowired
    ICongViecRepos iCongViecRepos;


    @Override
    public Iterable<CongViec> findAll() {
        return iCongViecRepos.findAll();
    }

    @Override
    public Optional<CongViec> findById(Date id) {
        return iCongViecRepos.findById(id);
    }

    @Override
    public Iterable<CongViec> findByName(String name) {
        return iCongViecRepos.findByTenCtyContaining(name);
    }

    @Override
    public void save(CongViec t) {
        iCongViecRepos.save(t);
    }

    @Override
    public void remove(Date id) {
        iCongViecRepos.deleteById(id);
    }
}
