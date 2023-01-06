package com.example.ss11_bt_bai1.service;

import com.example.ss11_bt_bai1.models.Category;
import com.example.ss11_bt_bai1.models.Writing;
import com.example.ss11_bt_bai1.repository.WritingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class WritingServiceImpl implements IWritingService {
    @Autowired
    private WritingRepository repository;

    @Override
    public Page<Writing> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Iterable<Writing> findAllNoSort() {
        return repository.findAll();
    }

    @Override
    public Writing findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(Writing writing) {
        repository.save(writing);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Iterable<Writing> findAllByCategory(Category category) {
        return repository.findAllByCategory(category);
    }

    @Override
    public Page<Writing> findAllByTittleContaining(String tittle, Pageable pageable) {
        return repository.findAllByTittleContaining(tittle,pageable);
    }
}
