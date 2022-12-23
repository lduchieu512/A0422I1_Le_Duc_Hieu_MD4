package com.codegym.ss9_th_bai1.service;

import com.codegym.ss9_th_bai1.model.Customer;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll()throws Exception;

    Optional<T> findById(Long id)throws Exception;

    Customer save(T t)throws Exception;

    void remove(Long id)throws Exception;
}
