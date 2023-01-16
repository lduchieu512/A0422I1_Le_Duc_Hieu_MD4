package com.example.demo.controller;

import com.example.demo.model.CongViec;
import com.example.demo.model.SinhVien;
import com.example.demo.model.TotNghiep;
import com.example.demo.service.ICongViecService;
import com.example.demo.service.ISinhVienService;
import com.example.demo.service.ITotNghiepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class testAPi {
    @Autowired
    ICongViecService service;

    @Autowired
    ITotNghiepService totNghiepService;
    @Autowired
    ISinhVienService sinhVienService;

    @GetMapping("/congviec")
    public ResponseEntity<Iterable<CongViec>> listCV() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/sinhvien")
    public ResponseEntity<Iterable<SinhVien>> listSV() {
        return new ResponseEntity<>(sinhVienService.findAll(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/totnghiep")
    public ResponseEntity<Iterable<TotNghiep>> totnghiep() {
        return new ResponseEntity<>(totNghiepService.findAll(), HttpStatus.ACCEPTED);
    }
}
