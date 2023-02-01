package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class controller {
   @Autowired
    private IService service;

    @GetMapping("/create")
    public String viewCreate(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "home";
    }


    @PostMapping("/create")
    public String create(@ModelAttribute("employee") Employee employee, RedirectAttributes redirectAttributes) {
        service.create(employee);
        redirectAttributes.addFlashAttribute("mess", "Add New Blog Successfully");
        return "redirect:/home";
    }

}
