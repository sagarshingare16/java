package com.security.restController;

import com.security.model.Student;
import com.security.service.CustomUserDetailsService;
import com.security.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/studentAuth-controller")
public class StudentRestController {

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private StudentRegistrationService registrationService;

    @PostMapping("/register")
    public ResponseEntity<Student> studentRegistration(@RequestBody Student student){
        return new ResponseEntity<>(registrationService.registerStudent(student), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Student student){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(student.getLoginId()
                , student.getLoginPassword()));
        if (authentication.isAuthenticated())
            return new ResponseEntity<>("You are logged in successfully", HttpStatus.OK);
        else
            return new ResponseEntity<>("Failed to login.",HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
