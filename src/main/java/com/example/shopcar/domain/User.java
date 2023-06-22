package com.example.shopcar.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String surname;
    private String phone;
    private String email;
    private Double budget;

    @ManyToOne
    @JoinColumn(name="car_id")
    private Car cars;
}
