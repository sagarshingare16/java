package com.security.restController;

import com.security.model.Student;
import com.security.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/registration-controller")
public class StudentRegistrationController {

    @Autowired
    private StudentRegistrationService registrationService;

    @PostMapping("/register")
    public ResponseEntity<Student> studentRegistration(@RequestBody Student student){
        return new ResponseEntity<>(registrationService.registerStudent(student), HttpStatus.CREATED);
    }
}
