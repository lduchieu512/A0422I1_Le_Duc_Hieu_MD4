package com.example.demo.service;

import com.example.demo.model.SinhVien;

import java.util.List;

public interface ISinhVienService extends IGeneralService<SinhVien> {
    List<SinhVien> findAllByName(String name);
}
