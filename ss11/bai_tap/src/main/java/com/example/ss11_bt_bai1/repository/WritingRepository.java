package com.example.ss11_bt_bai1.repository;

import com.example.ss11_bt_bai1.models.Category;
import com.example.ss11_bt_bai1.models.Writing;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WritingRepository extends PagingAndSortingRepository<Writing,Long> {
    Iterable<Writing> findAllByCategory(Category category);
    Page<Writing> findAllByTittleContaining(String title, Pageable pageable);
}
