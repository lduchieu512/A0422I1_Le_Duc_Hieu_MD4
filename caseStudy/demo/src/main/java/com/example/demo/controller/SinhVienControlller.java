package com.example.demo.controller;

import com.example.demo.model.CongViec;
import com.example.demo.model.SinhVien;
import com.example.demo.service.ICongViecService;
import com.example.demo.service.ISinhVienService;
import com.example.demo.service.ITotNghiepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class SinhVienControlller {

    @Autowired
    ISinhVienService sinhVienService;
    @Autowired
    ICongViecService service;

    @Autowired
    ITotNghiepService totNghiepService;

    @GetMapping("")
    public String goHome(Model model) {
        model.addAttribute("listCv", service.findAll());
        model.addAttribute("listTn", totNghiepService.findAll());
        model.addAttribute("listSv", sinhVienService.findAll());
        return "list";
    }

    @GetMapping("/search")
    public String searchByNameSVandTenCT(@RequestParam(value = "name_search", defaultValue = "") String name,
                                         Model model,
                                         @RequestParam(value = "tenCT_search", defaultValue = "") String namect) {
        List<SinhVien> list = sinhVienService.findAllByName(name);
        model.addAttribute("listTn", totNghiepService.findAll());
        if (namect != "") {
            Iterable<CongViec> congViec = service.findByName(namect);
            model.addAttribute("listCv", service.findByName(namect));
            CongViec temp = congViec.iterator().next();
           list = list.stream().filter(x -> x.getSoCMND() == temp.getSinhVien().getSoCMND()).collect(Collectors.toList());
        }
        model.addAttribute("listSv", list);
        return "list";
    }
}
