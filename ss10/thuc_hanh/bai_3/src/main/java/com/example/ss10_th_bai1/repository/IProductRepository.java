package com.example.ss10_th_bai1.repository;

import com.example.ss10_th_bai1.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
}
