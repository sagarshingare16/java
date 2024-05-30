package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class QueryParamController {
    @GetMapping("/get")
    public String generateSomeMsg(@RequestParam("name")String n, String course, Map<String, Object> model) {
        String msg="Hey There! "+n+ " , I hope Youre enjoying the journey of learning "+course;

        model.put("msg",msg);
        return "index";

    }

}
