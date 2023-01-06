package com.example.ss11_bt_bai1.service;


import com.example.ss11_bt_bai1.models.Category;
import com.example.ss11_bt_bai1.models.Writing;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IWritingService {
    Page<Writing> findAll(Pageable  pageable);

    Iterable<Writing> findAllNoSort();

    Writing findById(Long id);

    void save(Writing writing);

    void remove(Long id);

    Iterable<Writing> findAllByCategory(Category category);

    Page<Writing> findAllByTittleContaining(String tittle, Pageable pageable);
}
