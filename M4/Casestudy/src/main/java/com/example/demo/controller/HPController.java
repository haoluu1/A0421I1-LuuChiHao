package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HPController {
    @GetMapping("")
    public String showHomePage(){
        return "/view";
    }
}
