package com.example.shopcar.controllers;

import com.example.shopcar.domain.Car;
import com.example.shopcar.domain.User;
import com.example.shopcar.service.CarService;
import com.example.shopcar.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final CarService carService;

    public UserController(UserService userService, CarService carService) {
        this.userService = userService;
        this.carService = carService;
    }

    @GetMapping("/add")
    public String user(Model model){
        List<Car> carList = carService.allCars();
        model.addAttribute("allCars", carList);
        return "user/user";
    }

    @PostMapping("/add")
    public String addUser(Model model,
                          User user){
        userService.addUser(user);
        return "user/user";
    }

}
