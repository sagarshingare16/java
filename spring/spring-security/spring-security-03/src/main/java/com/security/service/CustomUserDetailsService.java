package com.security.service;

import com.security.model.Student;
import com.security.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
        Student student  = studentRepository.findByLoginId(loginId);
        if(student != null){
            return User.builder()
                    .username(student.getLoginId())
                    .password(student.getLoginPassword())
                    .build();
        }
        throw new UsernameNotFoundException("User not found: "+ loginId);
    }
}
