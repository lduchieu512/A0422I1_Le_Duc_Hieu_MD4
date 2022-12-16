package com.example.ss1_th_bai_1.service;

import com.example.ss1_th_bai_1.bean.Student;
import com.example.ss1_th_bai_1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudenServiceImpl implements StudenService{
    @Autowired
    StudentRepository studentRepository;
    @Override
    public void createOrUpdate(Student student) {
        studentRepository.createOrUpdate(student);
    }

    @Override
    public Student finById(String id) {
        return studentRepository.finById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        studentRepository.deleteById(id);
    }
}
