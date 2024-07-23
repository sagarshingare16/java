package com.springJwt.service;

import com.springJwt.jwtConfig.JwtUtils;
import com.springJwt.model.EntityDetails;
import com.springJwt.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EntityService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    JwtUtils jwtUtils;

    public EntityDetails registerEntity(EntityDetails entityDetails) {
        entityDetails.setPassword(passwordEncoder.encode(entityDetails.getPassword()));
        userDetailsRepository.save(entityDetails);
        return entityDetails;
    }

    public String login(EntityDetails entityDetails) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                entityDetails.getName(), entityDetails.getPassword()));
        if(authenticate.isAuthenticated())
            return jwtUtils.generateToken(entityDetails.getName());
        else
            throw new RuntimeException("Invalid credentials");
    }

    public EntityDetails getEntityDetails(Long id) {
        Optional<EntityDetails> entityDetailsOpt = userDetailsRepository.findById(id);
        if(entityDetailsOpt.isPresent())
            return entityDetailsOpt.get();
        else
            throw new RuntimeException("Entity not found");
    }

    public EntityDetails updateEntity(EntityDetails entityDetails) {
        Optional<EntityDetails> entityDetailsOpt = userDetailsRepository.findById(entityDetails.getId());
        if(entityDetailsOpt.isPresent()) {
            entityDetails.setEmail(entityDetails.getEmail());
            userDetailsRepository.save(entityDetails);
            return entityDetails;
        }else {
            return userDetailsRepository.save(entityDetails);
        }
    }
}
