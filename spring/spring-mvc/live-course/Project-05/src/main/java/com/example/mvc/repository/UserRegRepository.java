package com.example.mvc.repository;

import com.example.mvc.controller.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface UserRegRepository extends JpaRepository<UserRegistration,Integer> {

}
