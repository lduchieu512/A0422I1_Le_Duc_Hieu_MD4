package com.codegym.ss6_bt_bai_1.controller;

import com.codegym.ss6_bt_bai_1.model.Blog;
import com.codegym.ss6_bt_bai_1.service.IBlogService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("/list")
    public String list(Model model){
        List<Blog> blogList = blogService.findAll();
        model.addAttribute("blogList",blogList);
        return "list";
    }

    @GetMapping("/create")
    public String ShowCreate(Model model){
        model.addAttribute("blog",new Blog());
        return "/create";
    }
    @PostMapping("/create")
    public String doCreate(@ModelAttribute("blog") Blog blog,
                           Model model,
                           RedirectAttributes redirectAttributes){
        blogService.create(blog);
        redirectAttributes.addFlashAttribute("msg","Thêm mới thành công");
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") Integer id, Model model){
        Blog blog = blogService.findById(id);
        model.addAttribute("blog",blog);
        return "edit";
    }

    @PostMapping("/edit")
    public  String doEdit(@ModelAttribute("blog") Blog blog,
                          Model model,
                          RedirectAttributes redirectAttributes){
        blogService.update(blog);
        redirectAttributes.addFlashAttribute("msg","Edit successfully");
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String doDelete(@PathVariable("id") Integer id,
                           RedirectAttributes redirectAttributes){
        blogService.remove(id);
        redirectAttributes.addAttribute("msg","Delete successfully");
        return "redirect:/list";
    }

    @GetMapping("/view/{id}")
    public String doView(@PathVariable("id") Integer id,
                         Model model){
        Blog blog =blogService.findById(id);
        model.addAttribute("blog",blog);
        return "view";
    }


}
