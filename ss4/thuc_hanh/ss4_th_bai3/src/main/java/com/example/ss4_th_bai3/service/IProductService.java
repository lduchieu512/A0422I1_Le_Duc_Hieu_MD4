package com.example.ss4_th_bai3.service;

import com.example.ss4_th_bai3.bean.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(Integer id);
    void update(Integer id,Product product);
    void remove(Integer id);

}
