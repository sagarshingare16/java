package com.example.mvc.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GreetingServiceImpl implements GreetingService{

    @Override
    public String generateGreeting() {
        LocalDateTime localDateTime = LocalDateTime.now();
        int hour = localDateTime.getHour();
        if(hour < 12){
            return "Good Morning";
        } else if (hour < 16 ) {
            return "Good Afternoon";
        } else if (hour < 20) {
            return "Good Evening";
        }else {
            return "Good Night";
        }
    }
}
