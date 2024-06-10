package com.example.rest.controller;

import com.example.rest.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("api/v1/")
public class WithoutRestController {

    @Autowired
    WebService service;

    @GetMapping("/greet")
    @ResponseBody
    public ResponseEntity<String> generateGreetings(){
        return new ResponseEntity<>(service.generateGreeting(), HttpStatus.OK);
    }

}
