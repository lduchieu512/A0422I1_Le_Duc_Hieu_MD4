package com.codegym.ss9_bt_bai2.service;

import com.codegym.ss9_bt_bai2.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> getAllBooks();

    Book getBookById(Integer id);

    boolean rentBook( Book book);

    void giveBookBack(Book book);
}
