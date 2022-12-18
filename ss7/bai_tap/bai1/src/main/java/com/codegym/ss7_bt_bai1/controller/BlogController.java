package com.codegym.ss7_bt_bai1.controller;


import com.codegym.ss7_bt_bai1.model.Blog;
import com.codegym.ss7_bt_bai1.model.Category;
import com.codegym.ss7_bt_bai1.service.IBlogService;
import com.codegym.ss7_bt_bai1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @Autowired
    ICategoryService categoryService;


    @GetMapping("/blog/list")
    public String list(Model model){
        List<Blog> blogList = blogService.findAll();
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categoryList",categories);
        model.addAttribute("blogList",blogList);
        return "blog/list";
    }

    @GetMapping("/blog/create")
    public String ShowCreate(Model model){
        List<Category> categoryList= categoryService.findAll();
        Blog blog = new Blog();
        blog.setCategory(new Category());
        model.addAttribute("blog",blog);
        model.addAttribute("categoryList",categoryList);
        return "blog/create";
    }
    @PostMapping("/blog/create")
    public String doCreate(@ModelAttribute("blog") Blog blog,

                           RedirectAttributes redirectAttributes){
        blogService.create(blog);
        redirectAttributes.addFlashAttribute("msg","Thêm mới thành công");
        return "redirect:/blog/list";
    }

    @GetMapping("/blog/edit/{id}")
    public String showEdit(@PathVariable("id") Integer id, Model model){
        Blog blog = blogService.findById(id);
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categoryList",categories);
        model.addAttribute("blog",blog);
        return "blog/edit";
    }

    @PostMapping("/blog/edit")
    public  String doEdit(@ModelAttribute("blog") Blog blog,
                          RedirectAttributes redirectAttributes){
        blogService.update(blog);
        redirectAttributes.addFlashAttribute("msg","Edit successfully");
        return "redirect:/blog/list";
    }

    @GetMapping("/blog/delete/{id}")
    public String doDelete(@PathVariable("id") Integer id,
                           RedirectAttributes redirectAttributes){
        blogService.remove(id);
        redirectAttributes.addFlashAttribute("msg","Delete successfully");
        return "redirect:/blog/list";
    }

    @GetMapping("/blog/view/{id}")
    public String doView(@PathVariable("id") Integer id,
                         Model model){
        Blog blog =blogService.findById(id);
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categoryList",categories);
        model.addAttribute("blog",blog);
        return "blog/view";
    }




}
