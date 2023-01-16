package com.example.testfpt.controller;

import com.example.testfpt.model.SinhVien;
import com.example.testfpt.service.INganhService;
import com.example.testfpt.service.ISinhVienService;
import com.example.testfpt.service.ITruongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.model.IModel;

@Controller
public class SinhVienController {
    @Autowired
    ISinhVienService sinhvien;

    @Autowired
    ITruongService truong;

    @Autowired
    INganhService nganh;


    @GetMapping("/list")
    public String display(Model model){
        model.addAttribute("sinhvienList",sinhvien.findAll());
        model.addAttribute("listNganh",nganh.findAll());
        model.addAttribute("listTruong",truong.findAll());
        return "sinhvien/list";
    }

    @GetMapping("/create")
    public  String create(Model model){
        model.addAttribute("sinhVienlist",new SinhVien());
        model.addAttribute("listNganh",nganh.findAll());
        model.addAttribute("listTruong",truong.findAll());
        return "sinhVien/create";
    }







}
