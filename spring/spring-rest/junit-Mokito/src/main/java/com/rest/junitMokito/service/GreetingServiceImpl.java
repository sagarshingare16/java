package com.rest.junitMokito.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GreetingServiceImpl implements GreetingService{

    @Override
    public String generateWish() {
        LocalDateTime datetime = LocalDateTime.now();
        int hour=datetime.getHour();
        String wish=null;
        if(hour<12) {
            wish="Good Morning";
        }
        else if(hour<16) {
            wish="Good Afternoon";
        }
        else if(hour<20) {
            wish="Good Evening";
        }
        else {
            wish="Good night";
        }
        return wish;
    }
}
