package com.example.testfpt.service;

import com.example.testfpt.model.Truong;
import com.example.testfpt.repository.ITruongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class TruongServiceImpl implements ITruongService{
    @Autowired
    ITruongRepo repo;

    @Override
    public Iterable<Truong> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Truong> findById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public void save(Truong truong) {
        repo.save(truong);
    }

    @Override
    public void remove(Integer id) {
        repo.deleteById(id);
    }
}
