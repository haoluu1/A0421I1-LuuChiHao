package com.example.demo.controller;

import com.example.demo.model.employee.Division;
import com.example.demo.model.employee.EducationDegree;
import com.example.demo.model.employee.Employee;
import com.example.demo.model.employee.Position;
import com.example.demo.service.employee.IDivisionService;
import com.example.demo.service.employee.IEducationDegreeService;
import com.example.demo.service.employee.IEmployeeService;
import com.example.demo.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IPositionService positionService;

    @Autowired
    private IEducationDegreeService educationDegree;

    @Autowired
    private IDivisionService divisionService;

    @ModelAttribute("positionList")
    public List<Position> setPosition(){
        List<Position> positionList = positionService.findAll();
        return positionList;
    }

    @ModelAttribute("educationDegreeList")
    public List<EducationDegree> setEducationDegree(){
        List<EducationDegree> educationDegreeList = educationDegree.findAll();
        return educationDegreeList;
    }

    @ModelAttribute("divisionList")
    public List<Division> setDivision(){
        List<Division> divisionList = divisionService.findAll();
        return divisionList;
    }

    @GetMapping("/list")
    public String getAllEmployee(@RequestParam(defaultValue = "") String key_name,
                                 @RequestParam(defaultValue = "") String key_idCard,
                                 @RequestParam(defaultValue = "") String key_position,
                                 @PageableDefault(size = 2) Pageable pageable,
                                 Model model) {
        Page<Employee> employees = employeeService.getAllEmployee(key_name, key_idCard,key_position, pageable);
        model.addAttribute("employees", employees);
        model.addAttribute("key_name", key_name);
        model.addAttribute("key_idCard", key_idCard);
        model.addAttribute("key_position", key_position);
        return "/employeeHTML/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        Employee employee = new Employee();
        employee.setPosition(new Position());
        employee.setEducationDegree(new EducationDegree());
        employee.setDivision(new Division());
        model.addAttribute("employee", employee);
        return "/employeeHTML/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);
        return "redirect:/employee/list";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") int id, Model model){
        model.addAttribute("employee", employeeService.findById(id));
        return "/employeeHTML/view";
    }

    @GetMapping("/delete/{id}")
    public String showDelete(@PathVariable int id, Model model){
        model.addAttribute("employee", employeeService.findById(id));
        return "/employeeHTML/delete";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id") int id){
        employeeService.delete(id);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable int id, Model model){
        model.addAttribute("employee", employeeService.findById(id));
        return "/employeeHTML/edit";
    }

    @PostMapping("edit")
    public String edit(Employee employee){
        employeeService.save(employee);
        return "redirect:/employee/list";
    }
}
