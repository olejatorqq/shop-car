package com.example.shopcar.service;

import com.example.shopcar.domain.Car;
import com.example.shopcar.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void addCar(Car car){
        carRepository.save(car);
    }

    public List<Car> allCars(){
        return carRepository.findAll();
    }
}
