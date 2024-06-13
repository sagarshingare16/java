package com.example.rest.advice;

import com.example.rest.Exception.TouristNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class TouristErrorController {

    @ExceptionHandler(TouristNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleExceptionForTourist(TouristNotFoundException exception){
        ErrorDetails errorDetails = new ErrorDetails(HttpStatus.BAD_REQUEST, exception.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleGenericException(Exception exception){
        ErrorDetails errorDetails = new ErrorDetails(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage(),LocalDateTime.now());
        return new ResponseEntity<>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
