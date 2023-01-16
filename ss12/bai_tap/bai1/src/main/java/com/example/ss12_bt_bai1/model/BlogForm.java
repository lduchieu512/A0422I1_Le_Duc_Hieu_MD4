package com.example.ss12_bt_bai1.model;
import org.springframework.web.multipart.MultipartFile;

public class BlogForm {
    private Integer id;
    private  String createTime;
    private String author;
    private Integer category_id;
    private MultipartFile image;
    private String body;

    public BlogForm() {
    }

    public BlogForm(Integer id, String createTime, String author, Integer category_id, MultipartFile image, String body) {
        this.id = id;
        this.createTime = createTime;
        this.author = author;
        this.category_id = category_id;
        this.image = image;
        this.body = body;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
