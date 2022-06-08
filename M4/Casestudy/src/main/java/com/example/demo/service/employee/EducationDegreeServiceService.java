package com.example.demo.service.employee;

import com.example.demo.repository.employee.EducationDegreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceService implements IEducationDegreeService {
    @Autowired
    private EducationDegreeRepository educationDegreeRepository;

    @Override
    public List<com.example.demo.model.employee.EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
