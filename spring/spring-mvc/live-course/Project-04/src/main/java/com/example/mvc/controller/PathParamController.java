package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Controller
public class PathParamController {

    //localhost:8484/getMessage/Sagar
    @GetMapping("/getMessage/{name}/{course}")
    public String getSomeMsg(@PathVariable("name")String n, @PathVariable("course")String c, Map<String, Object> model) {
        String msg="Hey, "+ n+ " You can join our live "+ c+ " course in future";
        model.put("msg", msg);
        return "index";
    }
}
