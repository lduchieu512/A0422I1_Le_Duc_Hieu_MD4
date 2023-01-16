package com.example.demo.service.Impl;

import com.example.demo.model.SinhVien;
import com.example.demo.repos.ISinhVienRepos;
import com.example.demo.service.ISinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SinhVienServiceImpl implements ISinhVienService {
    @Autowired
    ISinhVienRepos iSinhVienRepos;

    @Override
    public Iterable<SinhVien> findAll() {
        return iSinhVienRepos.findAll();
    }

    @Override
    public Optional<SinhVien> findById(Integer id) {
        return iSinhVienRepos.findById(id);
    }

    @Override
    public void save(SinhVien sinhVien) {
        iSinhVienRepos.save(sinhVien);
    }

    @Override
    public void remove(Integer id) {
        iSinhVienRepos.deleteById(id);
    }

    @Override
    public List<SinhVien> findAllByName(String name) {
        return iSinhVienRepos.findAllByNameContaining(name);
    }
}
