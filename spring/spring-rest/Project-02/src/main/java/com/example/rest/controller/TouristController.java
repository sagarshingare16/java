package com.example.rest.controller;

import com.example.rest.model.Tourist;
import com.example.rest.service.TouristManagementImpl;
import jdk.jfr.Experimental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1")
public class TouristController {

    @Autowired
    TouristManagementImpl touristManagement;

    @PostMapping("/register")
    public ResponseEntity<String> registerTourist(@RequestBody Tourist tourist){
        try {
            return new ResponseEntity<>(touristManagement.registerTourist(tourist), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>("Unable to register",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/findAllTourist")
    public ResponseEntity<?> getAllTourist(){
        try {
            return new ResponseEntity<>(touristManagement.getAllTourist(),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Something went wrong",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/findTouristById/{touristId}")
    public ResponseEntity<?> getTouristById(@PathVariable Integer touristId){
        try{
            return new ResponseEntity<>(touristManagement.getTouristById(touristId),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Tourist not found",HttpStatus.BAD_REQUEST);
        }
    }

}
