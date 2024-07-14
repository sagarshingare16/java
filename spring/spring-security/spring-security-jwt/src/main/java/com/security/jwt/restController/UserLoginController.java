package com.security.jwt.restController;

import com.security.jwt.model.User;
import com.security.jwt.service.JwtTokenService;
import com.security.jwt.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth-controller")
public class UserLoginController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenService jwtTokenService;

    @Autowired
    UserInfoService userInfoService;

    @PostMapping("/login")
    public ResponseEntity<String> userLogin(@RequestBody User user){
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUserName(),user.getUserPassword()));
        if(authentication.isAuthenticated())
            return new ResponseEntity<>(jwtTokenService.generateToken(user.getUserName()),HttpStatus.OK);
        else
            return new ResponseEntity<>("Login failed!",HttpStatus.NOT_FOUND);
    }

    @GetMapping("/user-info")
    public ResponseEntity<User> userInfo(@PathVariable String userName){
        return new ResponseEntity<>(userInfoService.getUserInfo(userName),HttpStatus.OK);
    }

}
