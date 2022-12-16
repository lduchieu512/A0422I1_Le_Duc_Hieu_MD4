package com.example.ss4_bt_bai3.repository;

import com.example.ss4_bt_bai3.models.MedicalDeclaration;

public interface IMedicalRepository {
    MedicalDeclaration show();
    void addOfUpdate(MedicalDeclaration medicalDeclaration);
}
