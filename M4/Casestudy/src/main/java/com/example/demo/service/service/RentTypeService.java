package com.example.demo.service.service;

import com.example.demo.model.service.RentType;
import com.example.demo.repository.service.RentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService{
    @Autowired
    private RentTypeRepository rentTypeRepository;


    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
