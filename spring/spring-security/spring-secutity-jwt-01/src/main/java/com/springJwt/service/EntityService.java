package com.springJwt.service;

import com.springJwt.model.EntityDetails;
import com.springJwt.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EntityService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    public EntityDetails registerEntity(EntityDetails entityDetails) {
        entityDetails.setPassword(passwordEncoder.encode(entityDetails.getPassword()));
        userDetailsRepository.save(entityDetails);
        return entityDetails;
    }

    public String login(EntityDetails entityDetails) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                entityDetails.getName(), entityDetails.getPassword()));
        if(authenticate.isAuthenticated())
            return "Login Successful";
        else
            return "Login Failed";
    }
}
