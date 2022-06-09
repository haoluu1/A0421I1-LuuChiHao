package com.example.demo.controller;

import com.example.demo.model.customer.Customer;
import com.example.demo.model.customer.CustomerType;
import com.example.demo.model.customer.Gender;
import com.example.demo.model.employee.Division;
import com.example.demo.model.employee.EducationDegree;
import com.example.demo.model.employee.Employee;
import com.example.demo.model.employee.Position;
import com.example.demo.service.customer.ICustomerService;
import com.example.demo.service.customer.ICustomerTypeService;
import com.example.demo.service.customer.IGenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    ICustomerService customerService;

    @Autowired
    ICustomerTypeService customerTypeService;

    @Autowired
    IGenderService genderService;

    @ModelAttribute("customerTypeList")
    public List<CustomerType> setCustomerType(){
        List<CustomerType> customerTypeList = customerTypeService.findAll();
        return customerTypeList;
    }

    @ModelAttribute("genderList")
    public List<Gender> setGender(){
        List<Gender> genderList = genderService.findAll();
        return genderList;
    }

    @GetMapping("/list")
    public String getAllCustomer(@RequestParam(defaultValue = "") String key_name,
                                 @PageableDefault(size = 5) Pageable pageable,
                                 Model model){
        Page<Customer> customers = customerService.getAllCustomer(key_name, pageable);
        model.addAttribute("customers", customers);
        model.addAttribute("key_name", key_name);
        return "/customerHTML/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        Customer customer = new Customer();
        customer.setCustomerType(new CustomerType());
        customer.setGender(new Gender());
        model.addAttribute("customer", customer);
        return "/customerHTML/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "/customerHTML/view";
    }

    @GetMapping("/delete/{id}")
    public String showDelete(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "/customerHTML/delete";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id") int id){
        customerService.delete(id);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "/customerHTML/edit";
    }

    @PostMapping("/edit")
    public String edit(Customer customer){
        customerService.save(customer);
        return "redirect:/customer/list";
    }
}
