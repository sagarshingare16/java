package com.security.service;

import com.security.model.Student;
import com.security.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentRegistrationService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public Student registerStudent(Student student){
        student.setLoginPassword(passwordEncoder.encode(student.getLoginPassword()));
        return studentRepository.save(student);
    }

}
