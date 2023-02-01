package com.example.test;

import java.util.List;

public interface IService {
    List<Employee> findAll();
    void create(Employee employee );
}
