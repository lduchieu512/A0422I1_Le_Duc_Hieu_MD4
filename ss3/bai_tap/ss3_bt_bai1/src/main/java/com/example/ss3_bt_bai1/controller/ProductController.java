package com.example.ss3_bt_bai1.controller;

import com.example.ss3_bt_bai1.model.Product;
import com.example.ss3_bt_bai1.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class ProductController {
    @Autowired
    IProductService service;

    @GetMapping({"", "list"})
    public String showAll(Model model) {
        model.addAttribute("list", service.showAll());
        return "list";
    }

    @GetMapping("create")
    public String showCreateForm(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("create")
    public String saveProduct(Model model, @ModelAttribute("product") Product product) {
        service.createOrUpdate(product);
        return "redirect:list";
    }

    @GetMapping("search")
    public String search(Model model, @RequestParam String input) {
        if(input == "") {
            return "redirect:list";
        }
        model.addAttribute("list", service.findByName(input));
        return "list";
    }

    @GetMapping("detail")
    public String viewDetail(Model model, @RequestParam int id) {
        model.addAttribute("product", service.viewDetail(id));
        return "detail";
    }

    @GetMapping("update")
    public ModelAndView showUpdateForm(int id) {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("product", service.viewDetail(id));
        return modelAndView;
    }

    @GetMapping("delete")
    public ModelAndView delete(int id) {
        ModelAndView modelAndView = new ModelAndView("redirect:list");
        service.delete(id);
        return modelAndView;
    }
}
