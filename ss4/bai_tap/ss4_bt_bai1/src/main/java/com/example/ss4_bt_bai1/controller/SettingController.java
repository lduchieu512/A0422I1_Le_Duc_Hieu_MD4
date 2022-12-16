package com.example.ss4_bt_bai1.controller;

import com.example.ss4_bt_bai1.bean.Mail;
import com.example.ss4_bt_bai1.service.IMailService;
import com.example.ss4_bt_bai1.service.Impl.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SettingController {
    @Autowired
    IMailService service = new MailService();
    @GetMapping("")
    public ModelAndView showHome(){
        ModelAndView modelAndView = new ModelAndView("home","emailConfig",service.findAll());
        return modelAndView;
    }

    @GetMapping("/showUpdate")
    public String showUpdateForm (Model  model) {

        model.addAttribute("emailConfig", new Mail("",0,false,""));
        model.addAttribute("pageList",new Integer[] {5,10,15,25,50,100});
        model.addAttribute("languagesList", new String[] {"English", "Vietnamese", "Japanese", "Chinese"});
        return "updateForm";
    }
    @PostMapping("/update")
    public String update (@ModelAttribute("emailConfig") Mail email, RedirectAttributes redirectAttributes) {
        service.update(email);
        redirectAttributes.addFlashAttribute("msg","Update successfully");
        return "redirect:/";
    }

}
