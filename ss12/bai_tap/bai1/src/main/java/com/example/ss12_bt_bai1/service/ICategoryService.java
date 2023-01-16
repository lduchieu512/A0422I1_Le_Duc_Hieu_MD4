package com.example.ss12_bt_bai1.service;

import com.example.ss12_bt_bai1.model.Category;

import java.util.Optional;

public interface ICategoryService {
    Iterable<Category> findAll();

    Optional<Category> findById(Integer category_id);
}
