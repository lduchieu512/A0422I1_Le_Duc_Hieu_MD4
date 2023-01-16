package com.example.testfpt.repository;

import com.example.testfpt.model.Nganh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INganh extends JpaRepository<Nganh,Integer> {
}
