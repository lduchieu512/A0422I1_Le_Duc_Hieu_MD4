package com.example.demo.repos;

import com.example.demo.model.CongViec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.sql.Date;
import java.util.Optional;

@Repository
public interface ICongViecRepos extends JpaRepository<CongViec, Date> {
    Iterable<CongViec> findByTenCtyContaining(String name);
}
