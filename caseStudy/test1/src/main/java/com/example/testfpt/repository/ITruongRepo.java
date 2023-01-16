package com.example.testfpt.repository;

import com.example.testfpt.model.Truong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITruongRepo extends JpaRepository<Truong,Integer> {
}
