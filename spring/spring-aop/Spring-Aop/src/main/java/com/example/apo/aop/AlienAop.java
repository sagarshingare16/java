package com.example.apo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
public class AlienAop {

    @Before(value = "execution(* com.example.apo.restController.*.*(..))")
    public void beforeAdviceAlienRestController(JoinPoint joinPoint){
        System.out.println("Request made to :: " +joinPoint.getSignature()+ " :: " +LocalDateTime.now());
    }

    @After(value = "execution(* com.example.apo.restController.*.*(..))")
    public void afterAdviceAlienRestController(JoinPoint joinPoint){
        System.out.println("Resp from :: " +joinPoint.getSignature()+ " :: " +LocalDateTime.now());
    }

    /*@Around(value = "execution(* com.example.apo.restController.*.*(..))")
    public void beforeAndAfterAdviceAlienRestController(JoinPoint joinPoint){
        System.out.println("calling alien restController methods :: " +joinPoint.getSignature()+ " :: " +LocalDateTime.now());
    }*/

    @AfterThrowing(value = "execution(* com.example.aop.service.AlienServiceImpl.registerAlienInfo(..))")
    public void afterExceptionInAlienService(JoinPoint joinPoint){
        System.out.println("Resp came form :: " +joinPoint.getSignature()+ " :: "+LocalDateTime.now());
    }

}
