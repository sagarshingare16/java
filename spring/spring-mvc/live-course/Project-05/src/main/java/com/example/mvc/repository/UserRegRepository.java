package com.example.mvc.repository;

import com.example.mvc.controller.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRegRepository extends JpaRepository<UserRegistration,Integer> {

}
