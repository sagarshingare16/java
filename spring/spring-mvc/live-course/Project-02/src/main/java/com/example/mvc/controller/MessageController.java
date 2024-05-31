package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/messages")
public class MessageController {

    /*@GetMapping("/msg")
    public String displayMessage(Model model){
        System.out.println("Model class is implemented by :" +model.getClass().getName());
        model.addAttribute("key","Hello and Welcome!");
        return "message";
    }*/

    @GetMapping("/message")
    public void displayMessage(Model model){
        System.out.println("Model class is implemented by :" +model.getClass().getName());
        model.addAttribute("key","Hello and Welcome!");
    }

}
