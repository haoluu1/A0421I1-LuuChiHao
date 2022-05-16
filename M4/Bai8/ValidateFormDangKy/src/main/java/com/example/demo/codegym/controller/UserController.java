package com.example.demo.codegym.controller;

import com.example.demo.codegym.dto.UserDto;
import com.example.demo.codegym.model.User;
import com.example.demo.codegym.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public String list(Model model){
        model.addAttribute("users", userService.findAll());
        return "/user/list";
    }

    @GetMapping("/create")
    public String viewCreate(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "/user/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated UserDto userDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes,
                         Model model) {
        new UserDto().validate(userDto, bindingResult);
        System.out.println(userDto);
        if (bindingResult.hasFieldErrors()){
            return "/user/create";
        }
        else {
            User user = new User();
            BeanUtils.copyProperties(userDto, user);
            userService.save(user);
            redirectAttributes.addFlashAttribute("message", "Create User: " + user.getFirstName() + "OK!");
            return "redirect:/user";
        }
    }
}
