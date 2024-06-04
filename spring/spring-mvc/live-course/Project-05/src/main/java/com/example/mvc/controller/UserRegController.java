package com.example.mvc.controller;

import com.example.mvc.service.UserRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/register")
public class UserRegController {

    @Autowired
    UserRegService userRegService;


    @GetMapping
    public String getHomePage(){
        return "register";
    }

    /*@PostMapping
    public String registerUser(Map<String,Object> objectMap, @ModelAttribute("userReg") UserRegistration userRegistration){
        objectMap.put("userReg",userRegistration);
        return "response";
    }*/


    @PostMapping("/registerCustomer")
    public void registerUser(@ModelAttribute("userRegistration") UserRegistration userRegistration,Map<String, Object> model){
        UserRegistration user =  userRegService.registerUser(userRegistration);
        /*model.put("userReg",user);
        return "response";*/
        System.out.println(user);
    }
}
