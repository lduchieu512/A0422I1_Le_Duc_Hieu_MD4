package com.codegym.ss9_bt_bai2.controller;

import com.codegym.ss9_bt_bai2.exception.GiveBookBackException;
import com.codegym.ss9_bt_bai2.exception.RentBookException;
import com.codegym.ss9_bt_bai2.model.Book;
import com.codegym.ss9_bt_bai2.service.IBookService;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

@Controller
@Aspect
public class BookController {

    private Map<Integer, Book> bookMap=new HashMap<>();

    @Autowired
    private IBookService bookService;

    @GetMapping("/books")
    public ModelAndView viewAllBook(){
        return new ModelAndView("list","books",bookService.getAllBooks());
    }

    @GetMapping("/toRentBook/{id}")
    public ModelAndView viewRentBook(@PathVariable(value = "id") Integer id){
        Book book = bookService.getBookById(id);
        Random rand = new Random();
        Integer random = rand.nextInt(99999-10000)+10000;
        if (book==null){
            return new ModelAndView("error");
        }
        ModelAndView modelAndView = new ModelAndView("rentBook","book",book);
        modelAndView.addObject("random",random);
        return modelAndView;
    }

    @PostMapping("/rentBook/{random}")
    public ModelAndView rentBook(@ModelAttribute Book book,
                                 @PathVariable(value = "random") Integer random)throws RentBookException{
        if (bookService.rentBook(book)){
            bookMap.put(random,book);
            System.out.println(random);
            return new ModelAndView("list","books",bookService.getAllBooks());
        }throw new RentBookException();
    }

    @AfterThrowing(pointcut = "execution(public * com.codegym.ss9_bt_bai2.controller.BookController.rentBook())")
    public void writeLog(){
        System.out.println("Hello");
    }

    @ExceptionHandler(RentBookException.class)
    public ModelAndView showInputNotAcceptable(){
        return new ModelAndView("error");
    }

    @GetMapping("/give_book_back")
    public ModelAndView viewGiveBookBack(){
        return new ModelAndView("GiveBookBack");
    }

    @PostMapping("/give_book_back")
    public ModelAndView giveBookBack(@RequestParam int random) throws GiveBookBackException {
        System.out.println(random);
        if(bookMap.containsKey(random)) {
            Book book= bookMap.get(random);
            bookService.giveBookBack(book);
            bookMap.remove(random);
            return new ModelAndView("list","books",bookService.getAllBooks());
        }
        throw new GiveBookBackException();
    }

    @GetMapping("edit/{id}")
    public ModelAndView edit(@PathVariable("id") Integer id){
        Optional<Book> book = Optional.ofNullable(bookService.getBookById(id));
        ModelAndView modelAndView = new ModelAndView("/edit");
        return modelAndView;
    }

    @ExceptionHandler(GiveBookBackException.class)
    public ModelAndView showErrorGiveBookBack() {
        return new ModelAndView("errorGiveBookBack");
    }














}
