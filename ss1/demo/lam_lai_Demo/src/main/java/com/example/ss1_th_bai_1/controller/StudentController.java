package com.example.ss1_th_bai_1.controller;

import com.example.ss1_th_bai_1.service.StudenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @Autowired
    StudenService studenService;
    @GetMapping("/student/list")
    public String displayList(Model model){
        model.addAttribute("student",studenService.findAll());
        return "/student/list";
    }


}
