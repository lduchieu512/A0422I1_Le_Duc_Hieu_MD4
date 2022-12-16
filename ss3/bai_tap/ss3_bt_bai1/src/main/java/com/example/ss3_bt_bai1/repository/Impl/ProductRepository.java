package com.example.ss3_bt_bai1.repository.Impl;

import com.example.ss3_bt_bai1.model.Product;
import com.example.ss3_bt_bai1.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class ProductRepository implements IProductRepository {
    private static Map<Integer, Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "Laptop", 15));
        productMap.put(2, new Product(2, "Camera", 12));
        productMap.put(3, new Product(3, "Phone", 7));
        productMap.put(4, new Product(4, "Bicycle", 65));
        productMap.put(5, new Product(5, "PC", 100));
    }
    @Override
    public List<Product> showAll() {
        return new ArrayList<>(productMap.values());

    }

    @Override
    public void createOrUpdate(Product product) {
        productMap.put(product.getId(), product);

    }

    @Override
    public void delete(int id) {
        productMap.remove(id);

    }

    @Override
    public Product viewDetail(int id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> findByName(String input) {
        List<Product> findResult = new ArrayList<>();
        List<Product> allProduct = showAll();
        for (Product p : allProduct) {
            if(p.getName().toLowerCase().contains(input.toLowerCase())) {
                findResult.add(p);
            }
        }
        return findResult;
    }
}
