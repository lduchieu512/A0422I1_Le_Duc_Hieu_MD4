package com.example.casestudy_a04.controller;

import com.example.casestudy_a04.model.MainService.MainService;
import com.example.casestudy_a04.model.MainService.RentType;
import com.example.casestudy_a04.model.MainService.ServiceType;
import com.example.casestudy_a04.model.customer.Customer;
import com.example.casestudy_a04.model.customer.CustomerType;
import com.example.casestudy_a04.service.mainServiceService.IRentTypeService;
import com.example.casestudy_a04.service.mainServiceService.IServiceService;
import com.example.casestudy_a04.service.mainServiceService.IServiceTypeService;
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
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private IRentTypeService rentTypeService;

    @Autowired
    private IServiceService serviceService;

    @Autowired
    private IServiceTypeService iServiceTypeService;

    @GetMapping("/list")
    public String doList(Model model, @PageableDefault(value = 4)Pageable pageable,
                         @RequestParam("nameSearch") Optional<String> nameSearch,
                         @RequestParam("rentTypeSearch") Optional<String> rentTypeSearch,
                         @RequestParam("typeSearch") Optional<String> typeSearch){
        Page<MainService> serviceList;
        String condition = "";

        if (nameSearch.isPresent() || rentTypeSearch.isPresent() || typeSearch.isPresent()) {
            serviceList = serviceService.searchService(nameSearch.get(), rentTypeSearch.get(), typeSearch.get(), pageable);
            model.addAttribute("serviceList", serviceList);
        }

        if (nameSearch.isPresent()) {
            condition += "&nameSearch=" + nameSearch.get();
            model.addAttribute("nameSearch", nameSearch.get());
        }
        if (rentTypeSearch.isPresent()) {
            condition += "&rentTypeSearch=" + rentTypeSearch.get();
            model.addAttribute("rentTypeSearch", rentTypeSearch.get());
        }
        if (typeSearch.isPresent()) {
            condition += "&typeSearch=" + typeSearch.get();
            model.addAttribute("typeSearch", typeSearch.get());
        } else {
            serviceList = serviceService.findAllService(pageable);
            model.addAttribute("serviceList", serviceList);
        }

        List<RentType> rentTypeList = rentTypeService.findAllRentType();
        List<ServiceType> serviceTypeList = iServiceTypeService.findAllTypeService();

        model.addAttribute("rentTypeList",rentTypeList);
        model.addAttribute("serviceTypeList",serviceTypeList);
        model.addAttribute("condition", condition);
        return "service/list";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        MainService mainService = new MainService();
        mainService.setServiceTypeId(new ServiceType());
        mainService.setRentTypeId(new RentType());

        List<ServiceType> serviceTypeList = iServiceTypeService.findAllTypeService();
        List<RentType> rentTypeList = rentTypeService.findAllRentType();
        model.addAttribute("serviceTypeList",serviceTypeList);
        model.addAttribute("rentTypeList",rentTypeList);
        model.addAttribute("service",mainService);
        return "service/create";
    }

    @PostMapping("/create")
    public String doCreate(@Valid @ModelAttribute("service") MainService service, BindingResult bindingResult ,
                           Model model, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            service.setServiceTypeId(new ServiceType());
            service.setRentTypeId(new RentType());
            List<ServiceType> serviceTypeList = iServiceTypeService.findAllTypeService();
            List<RentType> rentTypeList = rentTypeService.findAllRentType();
            model.addAttribute("serviceTypeList",serviceTypeList);
            model.addAttribute("rentTypeList",rentTypeList);
            model.addAttribute("service",service);
            return "service/create";
        }
        serviceService.insertMainService(service);
        redirectAttributes.addFlashAttribute("mess","Create new successfully");
        return "redirect:/service/list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") String id, Model model){
        MainService service = serviceService.selectMainService(id);
        List<ServiceType> serviceTypeList = iServiceTypeService.findAllTypeService();
        List<RentType> rentTypeList = rentTypeService.findAllRentType();
        model.addAttribute("serviceTypeList",serviceTypeList);
        model.addAttribute("rentTypeList",rentTypeList);
        model.addAttribute("service",service);
        return "service/edit";
    }

    @PostMapping("/edit")
    public String doEdit(@Valid @ModelAttribute("service") MainService service, BindingResult bindingResult ,
                         Model model, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            service.setServiceTypeId(new ServiceType());
            service.setRentTypeId(new RentType());
            List<ServiceType> serviceTypeList = iServiceTypeService.findAllTypeService();
            List<RentType> rentTypeList = rentTypeService.findAllRentType();
            model.addAttribute("serviceTypeList",serviceTypeList);
            model.addAttribute("rentTypeList",rentTypeList);
            model.addAttribute("service",service);
            return "service/edit";
        }
        serviceService.updateMainService(service);
        redirectAttributes.addFlashAttribute("mess","Edit successfully");
        return "redirect:/service/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("idDelete")String id, RedirectAttributes redirectAttributes ){
        serviceService.deleteMainService(id);
        redirectAttributes.addFlashAttribute("mess","Delete successfully");
        return "redirect:/service/list";
    }
}
