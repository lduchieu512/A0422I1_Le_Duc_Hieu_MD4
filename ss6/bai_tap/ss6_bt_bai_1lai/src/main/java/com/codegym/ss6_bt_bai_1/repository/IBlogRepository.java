package com.codegym.ss6_bt_bai_1.repository;

import com.codegym.ss6_bt_bai_1.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
}
