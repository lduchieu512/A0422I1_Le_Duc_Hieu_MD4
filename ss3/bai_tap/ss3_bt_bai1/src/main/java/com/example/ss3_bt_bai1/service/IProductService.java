package com.example.ss3_bt_bai1.service;

import com.example.ss3_bt_bai1.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> showAll();
    void createOrUpdate(Product product);
    void delete(int id);
    Product viewDetail(int id);
    List<Product> findByName(String input);
}
