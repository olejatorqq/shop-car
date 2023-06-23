package com.example.shopcar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping
public class UserController {
    @GetMapping
    public String Home(Model model){
        model.addAttribute("text", "Hello!!!!");
        return "index";
    }

}
