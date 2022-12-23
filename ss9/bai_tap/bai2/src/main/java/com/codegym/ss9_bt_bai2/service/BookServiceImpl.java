package com.codegym.ss9_bt_bai2.service;

import com.codegym.ss9_bt_bai2.model.Book;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@Service
public class BookServiceImpl implements IBookService{
    private static Map<Integer, Book> books=new HashMap<>();

    static {
        books.put(0,new Book(0,"Làm giàu không khó",30));
        books.put(1,new Book(1,"Hành trang tuổi 20",12));
        books.put(2,new Book(2,"Chuyến xe cuối cùng",2));
    }
    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<Book>(books.values());
    }

    @Override
    public Book getBookById(Integer id) {
        Book book = books.get(id);
        if (book != null){
            return book;
        }
        return null;
    }

    @Override
    public boolean rentBook(Book book) {
        Book temp = books.get(book.getId());
        if (temp.getAmount()==0){
            return false;
        }else {
            temp.setAmount(temp.getAmount()-1);
            return true;
        }
    }

    @Override
    public void giveBookBack(Book book) {
        Book temp = books.get(book.getId());
        if (temp!=null){
            temp.setAmount(temp.getAmount()+1);
        }
    }
}
