package com.security.service;

import com.security.model.Student;
import com.security.model.StudentPrincipal;
import com.security.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
        Student student  = studentRepository.findByLoginId(loginId);
        if(student == null){
            System.out.println("User 404");
            throw new UsernameNotFoundException("User not found");
        }
        return new StudentPrincipal(student);
    }
}
