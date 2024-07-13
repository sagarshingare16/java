package com.security.jwt.service;

import com.security.jwt.model.User;
import com.security.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    @Autowired
    private UserRepository userRepository;

    public User getUserInfo(String userName){
        return userRepository.findByUserName(userName);
    }

}
