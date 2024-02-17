package com.example.springedu.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Slf4j
@Aspect
@Component
public class AOPLab3 {
    @Around("execution(* com.example.springedu.controller.EmpController.*(..))")
    public Object  traceTime(ProceedingJoinPoint joinPoint) throws Throwable {
        String method = joinPoint.getSignature().getName();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object returnObj = joinPoint.proceed();
        stopWatch.stop();
       log.info("[LOG]-수행시간"+stopWatch.getTotalTimeMillis()+"밀리초 +++++++++");
        return returnObj;
    }
}