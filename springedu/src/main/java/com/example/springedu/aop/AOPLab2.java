package com.example.springedu.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AOPLab2 {
    @Before("execution(* com.example.springedu.controller.MultiController.select*(..))")
    public void b(){
        log.info("[AOP]select_proc 수행전 #######");
    }
    @After("execution(* com.example.springedu.controller.MultiController.search_proc(..))")
    public void a(){
        log.info("[AOP]search_proc 수행후 #######");
    }
}
