package com.example.ss1_th_bai_1.service;

import com.example.ss1_th_bai_1.bean.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudenService {
    void createOrUpdate(Student student);
    Student finById(String id);
    List<Student> findAll();
    void deleteById(String id);
}
