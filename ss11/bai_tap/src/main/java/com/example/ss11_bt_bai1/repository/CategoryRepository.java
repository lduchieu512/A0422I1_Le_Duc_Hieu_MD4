package com.example.ss11_bt_bai1.repository;

import com.example.ss11_bt_bai1.models.Category;
import com.example.ss11_bt_bai1.models.Writing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category,Long> {
}
