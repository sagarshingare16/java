package com.rest.junitMokito.controller;

import com.rest.junitMokito.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greeting")
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @GetMapping("/greet")
    public ResponseEntity<String> generateGreetings(){
        return new ResponseEntity<>(greetingService.generateWish(), HttpStatus.OK);
    }
}
