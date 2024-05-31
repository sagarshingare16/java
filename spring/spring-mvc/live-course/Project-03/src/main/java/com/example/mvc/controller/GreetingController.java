package com.example.mvc.controller;

import com.example.mvc.service.GreetingServiceImpl;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    GreetingServiceImpl greetingService;

    @GetMapping
    public String getGreeting(Map<String,Object> map){
        map.put("wish",greetingService.generateGreeting());
        return "greeting";
    }

    @GetMapping("/greeting")
    public Map<String, Object> greeting2() {
        Map<String , Object> map=new HashMap<>();
        map.put("wish", greetingService.generateGreeting());
        return map;
    }

    @GetMapping("/getGreet")
    public void greeting3(HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<h1> Hello this is from Controller directly using Servlet -> " +greetingService.generateGreeting()+ "</h1>");
    }

}
