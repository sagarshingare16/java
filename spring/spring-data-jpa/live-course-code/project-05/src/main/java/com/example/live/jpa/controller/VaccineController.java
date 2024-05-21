package com.example.live.jpa.controller;

import com.example.live.jpa.model.Vaccine;
import com.example.live.jpa.service.VaccineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/v1/vaccines")
public class VaccineController {

    @Autowired
    VaccineServiceImpl vaccineService;

    @GetMapping("/{manufacturer}")
    public ResponseEntity<List<Vaccine>> getVaccineManufacturer( String manufacturer){
        return new ResponseEntity<>(vaccineService.fetchByVaccineManufacturer(manufacturer), HttpStatus.OK);
    }
}
