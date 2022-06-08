package com.example.demo.service.employee;

import com.example.demo.model.employee.Division;
import com.example.demo.repository.employee.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements IDivisionService{
    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
