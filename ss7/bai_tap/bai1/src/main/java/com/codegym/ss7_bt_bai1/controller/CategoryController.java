package com.codegym.ss7_bt_bai1.controller;

import com.codegym.ss7_bt_bai1.model.Category;
import com.codegym.ss7_bt_bai1.service.IBlogService;
import com.codegym.ss7_bt_bai1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    ICategoryService categoryService;

    @Autowired
    IBlogService blogService;

    @GetMapping("/create")
    public  String create(Model model){
        model.addAttribute("category",new Category());
        return "category/create";
    }
    @PostMapping("/create")
    public String doCreate(@ModelAttribute("category") Category category,
                          RedirectAttributes redirectAttributes){
        categoryService.create(category);
        redirectAttributes.addFlashAttribute("msg","Thêm mới thành công");
        return "redirect:/blog/list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id")Integer id,
                       Model model){
        Category category = categoryService.findById(id);
        model.addAttribute("category",category);
        return "category/edit";
    }

    @PostMapping("/edit")
    public String doEdit(@ModelAttribute("blog")Category category,
                         RedirectAttributes redirectAttributes){
        categoryService.update(category);
        redirectAttributes.addFlashAttribute("msg","Edit successfully");
        return "redirect:/blog/list";
    }
    @GetMapping("/delete/{id}")
    public String doDelete(@PathVariable("id") Integer id,
                           RedirectAttributes redirectAttributes){
        categoryService.delete(id);
        redirectAttributes.addFlashAttribute("msg","Delete successfully");
        return "redirect:/blog/list";
    }
    @GetMapping("/view/{id}")
    public  String doView(@PathVariable("id")Integer id,
                          Model model){
        Category category=categoryService.findById(id);
        model.addAttribute("category",category);
        return "category/view";
    }




}
