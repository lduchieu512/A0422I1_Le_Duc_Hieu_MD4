package com.example.demo.service.Impl;

import com.example.demo.model.Truong;
import com.example.demo.repos.ITruongRepos;
import com.example.demo.service.ITruongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class TruongServiceImpl implements ITruongService {
    @Autowired
    ITruongRepos iTruongRepos;

    @Override
    public Iterable<Truong> findAll() {
        return iTruongRepos.findAll();
    }

    @Override
    public Optional<Truong> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void save(Truong truong) {

    }

    @Override
    public void remove(Integer id) {

    }
}
