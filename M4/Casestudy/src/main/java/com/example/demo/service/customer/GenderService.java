package com.example.demo.service.customer;

import com.example.demo.model.customer.Gender;
import com.example.demo.repository.customer.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderService implements IGenderService{
    @Autowired
    private GenderRepository genderRepository;

    @Override
    public List<Gender> findAll() {
        return genderRepository.findAll();
    }
}
