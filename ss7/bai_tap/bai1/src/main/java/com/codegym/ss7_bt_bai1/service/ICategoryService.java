package com.codegym.ss7_bt_bai1.service;

import com.codegym.ss7_bt_bai1.model.Category;

import java.util.List;

public interface ICategoryService {
    void create(Category category);

    void update(Category category);

    void delete(Integer id);

    List<Category> findAll();

    Category findById(Integer id);
}
