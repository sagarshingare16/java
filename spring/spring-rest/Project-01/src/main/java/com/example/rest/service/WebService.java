package com.example.rest.service;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class WebService {
    public String generateGreeting(){
        LocalDateTime dateTime = LocalDateTime.now();
        int hour = dateTime.getHour();
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
