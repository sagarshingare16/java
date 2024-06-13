package com.example.rest.controller;

import com.example.rest.model.Tourist;
import com.example.rest.service.TouristServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TouristController {

    @Autowired
    TouristServiceImpl service;

    @PostMapping("/register")
    public ResponseEntity<String> registerTourist(@RequestBody Tourist tourist){
        return new ResponseEntity<>(service.registerTourist(tourist), HttpStatus.CREATED);
    }

    @GetMapping("/findAllTourist")
    public ResponseEntity<?> getAllTourist(){
        return new ResponseEntity<>(service.getAllTourist(),HttpStatus.OK);
    }

    @GetMapping("/findTouristById/{touristId}")
    public ResponseEntity<?> getTouristById(@PathVariable Integer touristId){
        return new ResponseEntity<>(service.getTouristById(touristId),HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateTouristInfo(Tourist tourist){
        return new ResponseEntity<>(service.updateTouristInfo(tourist),HttpStatus.ACCEPTED);
    }

    @PatchMapping("update/updateBudget/{touristId}/{updatedValue}")
    public ResponseEntity<String> updateTouristInfo(
            @PathVariable("touristId") Integer touristId,
            @PathVariable("updatedValue") double updatedValue){
        return new ResponseEntity<>(service.updateTouristInfoById(touristId,updatedValue),HttpStatus.OK);
    }

    @DeleteMapping("deleteAccount/{touristId}")
    public ResponseEntity<String> deleteTouristInfo(Integer touristId){
        return new ResponseEntity<>(service.deleteTouristById(touristId),HttpStatus.OK);
    }
}
