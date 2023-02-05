package com.example.casestudy_a04.controller;

import com.example.casestudy_a04.model.MainService.MainService;
import com.example.casestudy_a04.model.contract.Contract;
import com.example.casestudy_a04.model.customer.Customer;
import com.example.casestudy_a04.model.employee.Employee;
import com.example.casestudy_a04.service.contract.IContractService;
import com.example.casestudy_a04.service.customer.ICustomerService;
import com.example.casestudy_a04.service.employee.IEmployeeService;
import com.example.casestudy_a04.service.mainServiceService.IServiceService;
import com.example.casestudy_a04.validation.ValidationDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sun.applet.Main;

import javax.validation.Valid;
import javax.validation.Validation;
import java.util.List;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IServiceService serviceService;

    @Autowired
    private IContractService contractService;

    @GetMapping("/list")
    public String doList(Model model, @PageableDefault(value = 4)Pageable pageable){
        Page<Contract> contractList = contractService.findAllContract(pageable);
        List<Customer> customerList = customerService.findAllList();
        List<Employee> employeeList = employeeService.findAllList();
        List<MainService> serviceList  = serviceService.findAllList();

        model.addAttribute("contractList", contractList);
        model.addAttribute("employeeList", employeeList);
        model.addAttribute("customerList", customerList);
        model.addAttribute("serviceList", serviceList);
        return "contract/list";
    }
    @GetMapping("/create")
    public String showForm(Model model){
        List<Customer> customerList = customerService.findAllList();
        List<Employee> employeeList = employeeService.findAllList();
        List<MainService> serviceList  = serviceService.findAllList();
        Contract contract = new Contract();
        contract.setEmployeeId(new Employee());
        contract.setCustomerId(new Customer());
        contract.setServiceId(new MainService());


        model.addAttribute("employeeList", employeeList);
        model.addAttribute("customerList", customerList);
        model.addAttribute("serviceList", serviceList);
        model.addAttribute("contract", contract);
        return "contract/create";
    }

    @PostMapping("/create")
    public String doCreate(@Valid @ModelAttribute("contract")Contract contract, BindingResult bindingResult,
                           Model model, RedirectAttributes redirectAttributes){
        ValidationDate  validationDate = new ValidationDate();
        validationDate.validate(contract,bindingResult);
        if (bindingResult.hasErrors()){
            contract.setEmployeeId(new Employee());
            contract.setCustomerId(new Customer());
            contract.setServiceId(new MainService());
            List<Employee> employeeList = employeeService.findAllList();
            List<Customer> customerList = customerService.findAllList();
            List<MainService> serviceList = serviceService.findAllList();

            model.addAttribute("employeeList", employeeList);
            model.addAttribute("customerList", customerList);
            model.addAttribute("serviceList", serviceList);
            model.addAttribute("contract", contract);
            return "contract/create";
        }
        contractService.insertContract(contract);
        redirectAttributes.addFlashAttribute("mess", "Create new successfully");
        return "redirect:/contract/list";

    }
















}
