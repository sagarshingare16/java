package com.security.service;

import com.security.model.Student;
import com.security.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentRegistrationService {

    @Autowired
    private StudentRepository studentRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);

    public Student registerStudent(Student student){
        student.setLoginPassword(bCryptPasswordEncoder.encode(student.getLoginPassword()));
        return studentRepository.save(student);
    }

}
