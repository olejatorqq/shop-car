package com.example.shopcar.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {
    @GetMapping
    public String Home(){
        //model.addAttribute("text", "Hello!!!!");
        return "index";
    }

}