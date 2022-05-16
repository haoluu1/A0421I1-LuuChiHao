package com.example.demo.codegym.service;

import com.example.demo.codegym.model.User;

import java.util.List;

public interface IUserService{
    List<User> findAll();

    void create(User user);

    void save(User user);
}
