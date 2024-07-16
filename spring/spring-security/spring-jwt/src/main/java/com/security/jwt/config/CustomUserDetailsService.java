package com.security.jwt.config;

import com.security.jwt.model.UserInfo;
import com.security.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
        UserInfo userInfo = userRepository.findByLoginId(loginId);
        if(userInfo != null)
            return new UserPrincipal(userInfo);
        else
            throw new UsernameNotFoundException("User not found");
    }
}
