package com.example.ss12_bt_bai1.service;

import com.example.ss12_bt_bai1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void remove(int id);

    Optional<Blog> findById(int id);

    Page<Blog> findAll(Pageable pageable);

    List<Blog> findAllByCategory(String category);

    List<Blog> findAllByKey(String key);
}
