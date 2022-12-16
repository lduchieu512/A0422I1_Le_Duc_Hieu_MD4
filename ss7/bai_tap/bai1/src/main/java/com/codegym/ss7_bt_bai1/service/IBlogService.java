package com.codegym.ss7_bt_bai1.service;

import com.codegym.ss7_bt_bai1.model.Blog;

import java.util.List;

public interface IBlogService {

    List<Blog> findAll();

    void create(Blog blog);

    void update(Blog blog);

    void remove(Integer id);

    Blog findById(Integer id);

    List<Blog> search(String name);
}
