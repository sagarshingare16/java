package com.example.rest.Exception;

public class TouristNotFoundException extends RuntimeException{
    public TouristNotFoundException(String message) {
        super(message);
    }
}
