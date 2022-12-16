package com.example.ss1_th_bai_1.repository;

import com.example.ss1_th_bai_1.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepository {
    void createOrUpdate(Student student);
    Student finById(String id);
    List<Student> findAll();
    void deleteById(String id);
}
