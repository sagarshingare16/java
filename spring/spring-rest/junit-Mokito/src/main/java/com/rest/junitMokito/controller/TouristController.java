package com.rest.junitMokito.controller;

import com.rest.junitMokito.model.Tourist;
import com.rest.junitMokito.service.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tourist")
public class TouristController {

    @Autowired
    TouristService touristService;

    @PostMapping("/register")
    public ResponseEntity<String> registerTouristDetails(@RequestBody Tourist tourist){
        return new ResponseEntity<>(touristService.registerTourist(tourist), HttpStatus.CREATED);
    }
}
