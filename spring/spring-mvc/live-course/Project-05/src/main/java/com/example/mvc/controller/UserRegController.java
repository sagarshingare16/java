package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/register")
public class UserRegController {

    @GetMapping
    public String getHomePage(){
        return "register";
    }

    @PostMapping
    public String registerUser(Map<String,Object> objectMap, @ModelAttribute("userReg") UserRegistration userRegistration){
        objectMap.put("userReg",userRegistration);
        return "response";
    }
}
