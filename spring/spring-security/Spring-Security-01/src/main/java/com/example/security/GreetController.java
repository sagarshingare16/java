package com.example.security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greet")
public class GreetController {

    @GetMapping("/get-greeting")
    public String generateGreeting(HttpServletRequest request){
        return "Hello and Welcome with session Id: "+ request.getSession().getId();
    }

    @GetMapping("/get-greeting/{userName}")
    public String generateGreetingForUser(HttpServletRequest request, @PathVariable String userName){
        return "Hello and Welcome, "+ userName + request.getSession().getId();
    }
}
