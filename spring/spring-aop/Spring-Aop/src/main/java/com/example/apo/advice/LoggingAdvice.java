package com.example.apo.advice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAdvice {

    Logger logger = LoggerFactory.getLogger(LoggingAdvice.class);

    @Before(value = "execution(* com.example.apo.*.*.*(..))")
    public Object applicationLogger(JoinPoint joinPoint) throws Throwable {

        ObjectMapper mapper = new ObjectMapper();

        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getClass().toString();

        Object[] arr = joinPoint.getArgs();

        logger.info("method invoked :: {} :: {}()arguments :: {}", className, methodName, mapper.writeValueAsString(arr));

        return joinPoint.getThis();
    }
}
