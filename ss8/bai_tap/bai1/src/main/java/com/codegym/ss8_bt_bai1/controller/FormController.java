package com.codegym.ss8_bt_bai1.controller;

import com.codegym.ss8_bt_bai1.model.User;
import com.codegym.ss8_bt_bai1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class FormController {

    @Autowired
    IUserService userService;

    @GetMapping("/")
    public String display (Model model){
        List<User> users = userService.findAll();
        model.addAttribute("user",users);
        return "list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("user",new User());
        return "create";
    }

    @PostMapping("/create")
    public String doCreate(@Valid @ModelAttribute("user")User user,
                                        BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            return "/create";
        }
        userService.save(user);
        return "redirect:/list";
    }



}
