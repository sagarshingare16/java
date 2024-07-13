package com.security.restController;

import com.security.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/studentAuth-controller")
public class StudentRestController {

    @Autowired
    private MyUserDetailsService myUserDetailsService;

    @GetMapping("/login")
    public ResponseEntity<String> login(){
        return new ResponseEntity<>("You are logged in successfully", HttpStatus.OK);
    }
}
