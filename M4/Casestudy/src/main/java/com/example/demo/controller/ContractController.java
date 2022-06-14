package com.example.demo.controller;

import com.example.demo.model.contract.Contract;
import com.example.demo.model.customer.Customer;
import com.example.demo.model.employee.Employee;
import com.example.demo.model.service.Service;
import com.example.demo.service.contract.IContractService;
import com.example.demo.service.customer.ICustomerService;
import com.example.demo.service.employee.IEmployeeService;
import com.example.demo.service.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    IContractService contractService;

    @Autowired
    IEmployeeService employeeService;

    @Autowired
    ICustomerService customerService;

    @Autowired
    IServiceService serviceService;

    @ModelAttribute("employeeList")
    public List<Employee> setEmployee(){
        List<Employee> employeeList = employeeService.findAll();
        return employeeList;
    }

    @ModelAttribute("customerList")
    public List<Customer> setCustomer(){
        List<Customer> customerList = customerService.findAll();
        return customerList;
    }

    @ModelAttribute("serviceList")
    public List<Service> setService(){
        List<com.example.demo.model.service.Service> serviceList = serviceService.findAll();
        return serviceList;
    }

    @GetMapping("/list")
    public String getAllContract(@PageableDefault(size = 5) Pageable pageable,
                                 Model model){
        Page<Contract> contracts = contractService.getAllContract(pageable);
        model.addAttribute("contracts", contracts);
        return  "/contractHTML/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        Contract contract = new Contract();
        contract.setEmployee(new Employee());
        contract.setCustomer(new Customer());
        contract.setService(new Service());
        model.addAttribute("contract", contract);
        return "/contractHTML/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("contract") Contract contract){
        contractService.save(contract);
        return "redirect:/contract/list";
    }
}
