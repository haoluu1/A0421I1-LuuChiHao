package com.example.demo.codegym.service;

import com.example.demo.codegym.model.User;
import com.example.demo.codegym.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    IUserRepository iUserRepository;

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        iUserRepository.findAll().forEach(u -> users.add(u));
        return users;
    }

    @Override
    public void create(User user) {
        iUserRepository.save(user);
    }

    @Override
    public void save(User user) {
        iUserRepository.save(user);
    }
}
