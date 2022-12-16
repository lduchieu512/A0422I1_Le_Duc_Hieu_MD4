package com.codegym.ss7_bt_bai1.repository;

import com.codegym.ss7_bt_bai1.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ICategoryRepository extends JpaRepository<Category,Integer> {
}
