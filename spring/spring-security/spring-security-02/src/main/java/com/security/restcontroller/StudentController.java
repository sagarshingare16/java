package com.security.restcontroller;

import com.security.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/student-controller")
public class StudentController {


    public List<Student> studentList = new ArrayList<>(
            List.of(new Student(101,"Rohan","Java Spring Boot and Microservices."),
                    new Student(102,"Navin","Dev-Ops"),
                    new Student(103,"Sam","Python with FastApi"))
    );

    @GetMapping("/get-students")
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @GetMapping("/get-student/{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable int studentId){
        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                return new ResponseEntity<>(student, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(new Student(),HttpStatus.NOT_FOUND);
    }

    @GetMapping("/get-csrf-token")
    public ResponseEntity<CsrfToken> getCsrfToken(HttpServletRequest request){
        return new ResponseEntity<>((CsrfToken) request.getAttribute("_csrf"),HttpStatus.OK);
    }

    @PostMapping("/add-student")
    public ResponseEntity<String> allStudent(@RequestBody Student student){
        studentList.add(student);
        return new ResponseEntity<>("Student registered successfully.",HttpStatus.CREATED);
    }

}
