package com.example.ss12_bt_bai1.controller.RestfullWebService;

import com.example.ss12_bt_bai1.model.Blog;
import com.example.ss12_bt_bai1.model.Category;
import com.example.ss12_bt_bai1.service.IBlogService;
import com.example.ss12_bt_bai1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RestBlogController {
    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;


    @GetMapping("/category")
    public ResponseEntity<Iterable<Category>> findAllCategory() {
        List<Category> categories = (List<Category>) categoryService.findAll();
        if (categories.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
    //    Xem danh sach cac bai viet
    @GetMapping("/blog")
    public ResponseEntity<Iterable<Blog>> findAllBlog() {
        List<Blog> blogs = blogService.findAll();
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> findBlogById(@PathVariable Integer id){
        Optional<Blog> blog = blogService.findById(id);
        if (!blog.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog.get(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Blog> createBlogs(@RequestBody Blog blog){
        blogService.save(blog);
        return new ResponseEntity<>(blog,HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<Iterable<Blog>> showBlogs(@PageableDefault(value = 2) Pageable pageable){
        return new ResponseEntity<>(blogService.findAll(pageable),HttpStatus.OK);
    }

    @GetMapping("search")
    public ResponseEntity<Iterable<Blog>> searchBlogs(@RequestParam("key") String key,@PageableDefault(value = 2)Pageable pageable){
        if (key.isEmpty()||key==""){
            return new ResponseEntity<>(blogService.findAll(pageable.withPage(0)).getContent(),HttpStatus.OK);
        }
        List<Blog> blogs = blogService.findAllByKey("%"+ key+"%");
        if (blogs.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogs,HttpStatus.OK);
    }




}
