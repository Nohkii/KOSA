package com.example.springedu.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Slf4j
@Aspect
@Component
public class AOPLab1 {
    @Before("execution(* com.example.springedu.controller.HelloController.*(..))")
    public void b(){
    log.info("[AOP]hello 수행전===========");
    }
    @After("execution(* com.example.springedu.controller.HelloController.*(..))")
    public void a(){
        log.info("[AOP]hello 수행후===========");
    }
}
