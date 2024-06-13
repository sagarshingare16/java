package com.example.rest.advice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
    private HttpStatus statusCode;
    private String msg;
    private LocalDateTime localDateTime;
}
