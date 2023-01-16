package com.example.testfpt.service;

import com.example.testfpt.model.SinhVien;
import com.example.testfpt.repository.ISinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SinhvienServiceImpl implements ISinhVienService{

    @Autowired
    ISinhVienRepository repository;

    @Override
    public Iterable<SinhVien> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<SinhVien> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void save(SinhVien t) {
        repository.save(t);
    }


    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }


}
