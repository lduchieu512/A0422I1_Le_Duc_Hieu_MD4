package com.example.demo.repos;

import com.example.demo.model.Nganh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INganhRepos extends JpaRepository<Nganh,Integer> {
}
