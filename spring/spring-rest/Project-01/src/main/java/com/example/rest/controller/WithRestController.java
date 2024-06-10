package com.example.rest.controller;

import com.example.rest.model.Alien;
import com.example.rest.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class WithRestController {

    @Autowired
    WebService service;

    @GetMapping("/welcome1")
    public ResponseEntity<String> getWelcomeMsg(){
        return new ResponseEntity<>("Hello and Welcome please register yourself with planet name..", HttpStatus.OK);
    }

    @GetMapping("/welcome2")
    public ResponseEntity<String> getWelcomeMsg2(@RequestParam(
            value = "name",required = false,defaultValue = "Kevin") String name){
        return new ResponseEntity<>("Hello and Welcome Ar: "+name+ " ",HttpStatus.OK);
    }

    @GetMapping("/welcome3/{name}")
    public ResponseEntity<String> getWelcomeMsg(@PathVariable(
            value = "name",required = false) String name){
        return new ResponseEntity<>("Hello and Welcome Ar: "+name+ " ",HttpStatus.OK);
    }

    @GetMapping("/alineInfo")
    public ResponseEntity<Alien> getAlienInfo(){
        return new ResponseEntity<>(service.getAlien(),HttpStatus.OK);
    }

}
