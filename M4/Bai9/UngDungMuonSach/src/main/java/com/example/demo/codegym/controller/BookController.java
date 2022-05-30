package com.example.demo.codegym.controller;

import com.example.demo.codegym.model.Book;
import com.example.demo.codegym.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    @Autowired
    IBookService bookService;

    @GetMapping("")
    public String view(Model model){
        model.addAttribute("books", bookService.findAll());
        return "/book/view";
    }

    @GetMapping("/book/create")
    public String vcreate(Model model){
        model.addAttribute("book", new Book());
        return "/book/create";
    }

    @PostMapping("/book/create")
    public String create(Model model){
        
    }
}
