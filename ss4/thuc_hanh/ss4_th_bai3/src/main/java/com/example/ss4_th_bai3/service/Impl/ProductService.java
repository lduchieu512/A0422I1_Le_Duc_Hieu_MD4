package com.example.ss4_th_bai3.service.Impl;

import com.example.ss4_th_bai3.bean.Product;
import com.example.ss4_th_bai3.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService implements IProductService {
    private List<Product>products = new ArrayList<>();
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(Integer id) {
        return products.get(id);
    }

    @Override
    public void update(Integer id, Product product) {
        for (Product p:products) {
            if (p.getId()==id){
                p = product;
                break;
            }
        }
    }

    @Override
    public void remove(Integer id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()==id){
                products.remove(i);
                break;
            }
        }
    }
}
