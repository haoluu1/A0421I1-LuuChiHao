package com.example.demo.controller;

import com.example.demo.model.customer.Customer;
import com.example.demo.model.employee.Division;
import com.example.demo.model.employee.EducationDegree;
import com.example.demo.model.employee.Employee;
import com.example.demo.model.employee.Position;
import com.example.demo.model.service.RentType;
import com.example.demo.model.service.Service;
import com.example.demo.model.service.ServiceType;
import com.example.demo.service.service.IRentTypeService;
import com.example.demo.service.service.IServiceService;
import com.example.demo.service.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    IServiceService serviceService;

    @Autowired
    IRentTypeService rentTypeService;

    @Autowired
    IServiceTypeService serviceTypeService;

    @ModelAttribute("rentTypeList")
    public List<RentType> setRentType(){
        List<RentType> rentTypeList = rentTypeService.findAll();
        return rentTypeList;
    }

    @ModelAttribute("serviceTypeList")
    public List<ServiceType> setServiceType(){
        List<ServiceType> serviceTypeList = serviceTypeService.findAll();
        return serviceTypeList;
    }

    @GetMapping("/list")
    public String getAllCustomer(@RequestParam(defaultValue = "") String key_name,
                                 @PageableDefault(size = 2) Pageable pageable,
                                 Model model){
        Page<Service> services = serviceService.getAllService(key_name, pageable);
        model.addAttribute("services", services);
        model.addAttribute("key_name", key_name);
        return "/serviceHTML/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        Service service = new Service();
        service.setRentType(new RentType());
        service.setServiceType(new ServiceType());
        model.addAttribute("service", service);
        return "/serviceHTML/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("service") Service service){
        serviceService.save(service);
        return "redirect:/service/list";
    }
}
