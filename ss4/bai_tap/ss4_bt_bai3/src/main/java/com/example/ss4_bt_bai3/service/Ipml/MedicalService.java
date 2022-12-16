package com.example.ss4_bt_bai3.service.Ipml;

import com.example.ss4_bt_bai3.models.MedicalDeclaration;
import com.example.ss4_bt_bai3.repository.IMedicalRepository;
import com.example.ss4_bt_bai3.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalService implements IMedicalService {
    @Autowired
    IMedicalRepository medicalRepository;

    @Override
    public MedicalDeclaration show() {
        return medicalRepository.show();
    }

    @Override
    public void addOfUpdate(MedicalDeclaration medicalDeclaration) {
        medicalRepository.addOfUpdate(medicalDeclaration);
    }
}
