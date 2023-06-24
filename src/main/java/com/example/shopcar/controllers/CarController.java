package com.example.shopcar.controllers;

import com.example.shopcar.domain.Car;
import com.example.shopcar.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/add")
    public String Car(){
        return "car/car";
    }
    @PostMapping("/add")
    public String addCar(Car car){
        carService.addCar(car);
        return "car/car";
    }
    @GetMapping("/list")
    public String getAllCars(Model model,
                             Car car){
        List<Car> carList = carService.allCars();
        model.addAttribute("allCars", carList);
        return "car/carList";
    }
}
