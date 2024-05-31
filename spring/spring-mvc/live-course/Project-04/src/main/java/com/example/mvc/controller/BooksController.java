package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/books")
public class BooksController {

    @GetMapping("/home")
    public String displayHomePage(){
        return "home";
    }

    @GetMapping("/booksDetails")
    public String displayBooks(Map<String,Object> objectMap){
        String[] booksName=new String[] {"Java", "Junit5", "Spring Boot"};

        objectMap.put("books",booksName);
        return "books";

    }





}
