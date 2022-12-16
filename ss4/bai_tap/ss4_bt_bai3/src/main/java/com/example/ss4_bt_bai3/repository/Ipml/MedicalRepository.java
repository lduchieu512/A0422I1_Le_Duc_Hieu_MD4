package com.example.ss4_bt_bai3.repository.Ipml;

import com.example.ss4_bt_bai3.models.MedicalDeclaration;
import com.example.ss4_bt_bai3.repository.IMedicalRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MedicalRepository implements IMedicalRepository {
    MedicalDeclaration medicalDeclarationRepo  = new MedicalDeclaration();

    @Override
    public MedicalDeclaration show() {
        return medicalDeclarationRepo ;
    }

    @Override
    public void addOfUpdate(MedicalDeclaration medicalDeclaration) {
        medicalDeclarationRepo  = medicalDeclaration;
    }
}
