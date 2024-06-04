package com.example.mvc.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
public class UserRegistration {
    @Id
    private Integer userId;
    private String userName;
    private String userAddress;
    private int userPhoneNumber;
}
