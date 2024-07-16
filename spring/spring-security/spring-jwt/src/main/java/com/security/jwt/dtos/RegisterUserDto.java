package com.security.jwt.dtos;

import lombok.Data;

@Data
public class RegisterUserDto {
    private String loginId;
    private String password;
    private String name;
    private String userAddress;
    private String emailId;
    private String mobileNumber;
}
