package com.example.springedu.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AOPLab4 {
    @AfterThrowing(pointcut = "execution(* com.example.springedu.controller.ExceptionLocalController.detail(..))", throwing = "exception")
    public void errorCatch(Throwable exception) {
            log.info("[AOP] 오류 발생 :" +exception);
    }
}
