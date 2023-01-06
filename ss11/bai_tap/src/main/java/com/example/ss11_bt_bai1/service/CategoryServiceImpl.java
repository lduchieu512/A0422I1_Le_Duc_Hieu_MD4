package com.example.ss11_bt_bai1.service;

import com.example.ss11_bt_bai1.models.Category;
import com.example.ss11_bt_bai1.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private CategoryRepository repository;


    @Override
    public Page<Category> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Iterable<Category> findAllNoSort() {
        return repository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(Category category) {
        repository.save(category);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
