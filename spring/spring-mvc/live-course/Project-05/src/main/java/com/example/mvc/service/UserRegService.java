package com.example.mvc.service;

import com.example.mvc.controller.UserRegistration;
import com.example.mvc.repository.UserRegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegService {

    @Autowired
    UserRegRepository userRegRepository;

    public UserRegistration registerUser(UserRegistration userRegistration){
        return userRegRepository.save(userRegistration);
    }
}
