package com.example.ss4_bt_bai3.service;

import com.example.ss4_bt_bai3.models.MedicalDeclaration;

public interface IMedicalService {
     MedicalDeclaration show();
    void addOfUpdate(MedicalDeclaration medicalDeclaration);

}
