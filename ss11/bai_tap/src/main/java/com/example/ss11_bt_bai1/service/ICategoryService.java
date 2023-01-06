package com.example.ss11_bt_bai1.service;


import com.example.ss11_bt_bai1.models.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
public interface ICategoryService {
    Page<Category> findAll(Pageable pageable);

    Iterable<Category> findAllNoSort();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);
}
