package com.example.casestudy_a04.controller;

import com.example.casestudy_a04.model.customer.Customer;
import com.example.casestudy_a04.model.customer.CustomerType;

import com.example.casestudy_a04.service.customer.ICustomerService;
import com.example.casestudy_a04.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerTypeService customerTypeService;

    @Autowired
    private  ICustomerService iCustomerService;

    @GetMapping("list")
    public String doList(Model model, @PageableDefault(value = 4)Pageable pageable,
                         @RequestParam("nameSearch") Optional<String> nameSearch,
                         @RequestParam("emailSearch") Optional<String> emailSearch,
                         @RequestParam("typeSearch") Optional<String> typeSearch){
        Page<Customer> customerList;
        String condition = "";
        if (nameSearch.isPresent() || emailSearch.isPresent() || typeSearch.isPresent()) {
            customerList = iCustomerService.searchCustomer(nameSearch.get(), emailSearch.get(), typeSearch.get(), pageable);
            model.addAttribute("customerList", customerList);
        }

        if (nameSearch.isPresent()) {
            condition += "&nameSearch=" + nameSearch.get();
            model.addAttribute("nameSearch", nameSearch.get());
        }
        if (emailSearch.isPresent()) {
            condition += "&emailSearch=" + emailSearch.get();
            model.addAttribute("emailSearch", emailSearch.get());
        }

        if (typeSearch.isPresent()) {
            condition += "&typeSearch=" + typeSearch.get();
            model.addAttribute("typeSearch", typeSearch.get());
        } else {
            customerList= iCustomerService.findAllCustomer(pageable);
            model.addAttribute("customerList",customerList);
        }





        List<CustomerType> customerTypeList = customerTypeService.findAllCustomerType();
        model.addAttribute("customerTypeList",customerTypeList);
        model.addAttribute("condition", condition);
        return "customer/list";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        Customer customer = new Customer();
        customer.setCustomerTypeId(new CustomerType());
        List<CustomerType> customerTypeList = customerTypeService.findAllCustomerType();
        model.addAttribute("customerTypeList",customerTypeList);
        model.addAttribute("customer",customer);
        return "customer/create";
    }

    @PostMapping("/create")
    public String doCreate(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult ,
                           Model model, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            customer.setCustomerTypeId(new CustomerType());
            List<CustomerType> customerTypeList= customerTypeService.findAllCustomerType();
            model.addAttribute("customerTypeList",customerTypeList);
            model.addAttribute("customer", customer);
            return "customer/create";
        }
        iCustomerService.insertCustomer(customer);
        redirectAttributes.addFlashAttribute("mess","Create new successfully");
        return "redirect:/customer/list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") String id,Model model){
        Customer customer = iCustomerService.selectCustomer(id);
        List<CustomerType> customerTypeList = customerTypeService.findAllCustomerType();

        model.addAttribute("customerTypeList",customerTypeList);
        model.addAttribute("customer",customer);
        return "customer/edit";
    }

    @PostMapping("/edit")
    public String doEdit(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult ,
                         Model model, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            customer.setCustomerTypeId(new CustomerType());



            List<CustomerType> customerTypeList = customerTypeService.findAllCustomerType();

            model.addAttribute("customerTypeList",customerTypeList);
            model.addAttribute("customer",customer);
            return "customer/edit";
        }
        iCustomerService.updateCustomer(customer);
        redirectAttributes.addFlashAttribute("mess","Edit successfully");
        return "redirect:/customer/list";
    }


    @GetMapping("/delete")
    public String delete(@RequestParam("idDelete")String id, RedirectAttributes redirectAttributes ){
        iCustomerService.deleteCustomer(id);
        redirectAttributes.addFlashAttribute("mess","Delete successfully");
        return "redirect:/customer/list";
    }

}
