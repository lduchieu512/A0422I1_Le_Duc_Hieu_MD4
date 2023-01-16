package com.example.ss12_bt_bai1.service.Impl;

import com.example.ss12_bt_bai1.model.Category;
import com.example.ss12_bt_bai1.repository.ICategoryRepository;
import com.example.ss12_bt_bai1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Integer category_id) {
        return categoryRepository.findById(category_id);
    }
}
