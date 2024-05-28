package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

    @RequestMapping("/welcome")
    public ModelAndView displayMessage(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","Hello and Welcome");
        modelAndView.setViewName("index");

        return modelAndView;

    }

}
