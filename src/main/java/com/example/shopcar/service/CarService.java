package com.example.shopcar.service;

import com.example.shopcar.domain.Car;
import com.example.shopcar.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public boolean addCar(Car car){
        carRepository.save(car);
        return true;
    }
}
