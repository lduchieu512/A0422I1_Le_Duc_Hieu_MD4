package com.example.ss4_th_bai1.controller;

import com.example.ss4_th_bai1.bean.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
//    @RequestMapping(value = "showForm",method = RequestMethod.GET)
    @GetMapping(value = "/showForm")
    public String showForm(Model model){
        model.addAttribute("employee",new Employee());
        return "/employee/create";
    }
//    @RequestMapping(value = "/addEmployee",method = RequestMethod.POST)
    @PostMapping(value = "")
    public String submit(@ModelAttribute("employee")Employee employee, ModelMap modelMap){
        modelMap.addAttribute("name",employee.getName());
        modelMap.addAttribute("contactNumber",employee.getContactNumber());
        modelMap.addAttribute("id",employee.getId());
        return "/employee/info";
    }




}
