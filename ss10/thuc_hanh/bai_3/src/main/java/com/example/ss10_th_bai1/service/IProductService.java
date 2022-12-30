package com.example.ss10_th_bai1.service;

import com.example.ss10_th_bai1.model.Product;
import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
