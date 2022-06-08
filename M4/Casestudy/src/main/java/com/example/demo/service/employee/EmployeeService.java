package com.example.demo.service.employee;

import com.example.demo.model.employee.Employee;
import com.example.demo.repository.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> getAllEmployee(String name,
                                         String idCard,
//                                         double salary,
//                                         String phone,
//                                         String email,
//                                         String address,
                                         String position,
//                                         EducationDegree educationDegree,
//                                         Division division,
                                         Pageable pageable) {
        return employeeRepository.findAll(name, idCard, position, pageable);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.getById(id);
    }

    @Override
    public void delete(int id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if (employee != null){
            employeeRepository.delete(employee);
        }
    }
}
