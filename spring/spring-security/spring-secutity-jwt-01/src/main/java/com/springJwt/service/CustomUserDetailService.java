package com.springJwt.service;

import com.springJwt.model.EntityDetails;
import com.springJwt.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        EntityDetails user = userDetailsRepository.findByName(username);
        if(user!= null){
            return User.builder()
                    .username(user.getName())
                    .password(user.getPassword())
                    .roles("USER").build();
        }
        throw  new UsernameNotFoundException("User not found");
    }
}
