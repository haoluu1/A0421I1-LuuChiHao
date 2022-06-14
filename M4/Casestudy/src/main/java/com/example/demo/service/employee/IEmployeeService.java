package com.example.demo.service.employee;

import com.example.demo.model.employee.Division;
import com.example.demo.model.employee.EducationDegree;
import com.example.demo.model.employee.Employee;
import com.example.demo.model.employee.Position;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.ManyToOne;
import java.util.List;

public interface IEmployeeService {
    Page<Employee> getAllEmployee(String name,
                                  String idCard,
//                                  double salary,
//                                  String phone,
//                                  String email,
//                                  String address,
                                  String position,
//                                  EducationDegree educationDegree,
//                                  Division division,
                                  Pageable pageable);

    void save(Employee employee);

    Employee findById(int id);

    void delete(int id);

    List<Employee> findAll();
}
