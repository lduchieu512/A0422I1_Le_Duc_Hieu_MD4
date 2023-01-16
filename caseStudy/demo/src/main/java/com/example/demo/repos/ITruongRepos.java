package com.example.demo.repos;

import com.example.demo.model.Truong;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITruongRepos extends JpaRepository<Truong,Integer> {
}
