package com.example.shopcar.service;

import com.example.shopcar.domain.User;
import com.example.shopcar.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void addUser(User user){
        userRepository.save(user);
    }
}
