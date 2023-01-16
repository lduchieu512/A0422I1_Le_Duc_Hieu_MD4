package com.example.demo.repos;

import com.example.demo.model.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISinhVienRepos extends JpaRepository<SinhVien,Integer> {
    List<SinhVien> findAllByNameContaining(String name);
}
