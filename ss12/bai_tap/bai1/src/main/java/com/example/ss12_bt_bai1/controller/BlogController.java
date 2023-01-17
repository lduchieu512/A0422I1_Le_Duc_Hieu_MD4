package com.example.ss12_bt_bai1.controller;


import com.example.ss12_bt_bai1.model.Blog;
import com.example.ss12_bt_bai1.model.BlogForm;
import com.example.ss12_bt_bai1.model.Category;
import com.example.ss12_bt_bai1.service.IBlogService;
import com.example.ss12_bt_bai1.service.ICategoryService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

@Controller
@RequestMapping({"/blog","/home"})
public class BlogController {

    @Value("${file-upload}")
    private String uploadFolder;

    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView showBlogForm(@PageableDefault(value = 2)Pageable pageable){
        ModelAndView modelAndView = new ModelAndView(("blog/list"));
        modelAndView.addObject("blog",new BlogForm());
        modelAndView.addObject("category",categoryService.findAll());
        modelAndView.addObject("blogList",blogService.findAll(pageable));
        return  modelAndView;
    }
    @PostMapping("/list")
    public ModelAndView display(Model model,@PageableDefault(value = 2) Pageable pageable){
        model.addAttribute("blog",new BlogForm());
        return new ModelAndView("blog","blogList",blogService.findAll(pageable));
    }
    @GetMapping("/create")
    public ModelAndView showCreateFrom(@PageableDefault(value = 2) Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("blog/list");
        modelAndView.addObject("blog",new BlogForm());
        modelAndView.addObject("popup",3);
        modelAndView.addObject("blogList",blogService.findAll(pageable));
        return modelAndView;

    }
    @PostMapping("/create")
    public String createBlog(@ModelAttribute BlogForm blogForm, RedirectAttributes redirectAttributes) {
        MultipartFile file = blogForm.getImg();
        String fileName = file.getOriginalFilename();
        try {
            FileCopyUtils.copy(file.getBytes(), new File(uploadFolder + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Blog blog = new Blog();
        blog.setAuthor(blogForm.getAuthor());
        blog.setBody(blogForm.getBody());
        blog.setCreateTime(LocalDate.now().toString());
//        blog.setImage(fileName);
        blog.setImg(fileName);
        Category category = categoryService.findById(blogForm.getCategory_id()).get();
        blog.setCategory(category);
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Create blog: " + " OK!");
        return "redirect:/blog/list";
    }
    @GetMapping("/delete")
    public String deleteBlog(@RequestParam("id")Integer id,RedirectAttributes redirectAttributes)throws IOException{
        Blog blog = blogService.findById(id).get();
        if (blog != null){
            blogService.remove(id);
        }
        redirectAttributes.addFlashAttribute("message","Delete blog: " +"OK!");
        return "redirect:/blog/list";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditBlog(@PathVariable("id") Integer id,RedirectAttributes redirectAttributes,@PageableDefault(value = 2) Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("blog");
        modelAndView.addObject("blog",blogService.findById(id).get());
        modelAndView.addObject("popup",2);
        modelAndView.addObject("BlogList",blogService.findAll(pageable));
        redirectAttributes.addFlashAttribute("message","Edit blog. Please");
        return modelAndView;
    }





















}
