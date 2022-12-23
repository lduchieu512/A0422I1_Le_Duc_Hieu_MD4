package com.codegym.ss9_th_bai1.grandemonstration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @AfterThrowing(pointcut = "execution(public * com.codegym.ss9_th_bai1.service.customer.CustomerService.*(..))",throwing = "e")
    public void log(JoinPoint joinPoint, Exception e){
//        System.out.println("[CMS] co loi xay ra: " + e.getMessage());
        String firstName = joinPoint.getTarget().getClass().getSimpleName();
        String lastName = joinPoint.getSignature().getName();

        System.out.println(String.format("[CMS] co loi xay ra: %s.%s%s: %s", firstName, lastName,  e.getMessage()));
    }


}
