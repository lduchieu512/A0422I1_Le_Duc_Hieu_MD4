package com.example.demo.service;

import com.example.demo.model.CongViec;

import java.sql.Date;
import java.util.Optional;

public interface ICongViecService  {
    Iterable<CongViec> findAll();

    Optional<CongViec> findById(Date id);

    Iterable<CongViec> findByName(String name);

    void save(CongViec t);

    void remove(Date id);
}
