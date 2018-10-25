package com.zx.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class testAspect {

    //@Pointcut("execution(** com.alibaba.dubbo.config.get(..))")
    @Pointcut("execution(* com.alibaba.dubbo.config.spring.AnnotationBean.postProcessAfterInitialization(..))")
    public void getReference(){}

    @Around("getReference()")
    public void getBean(ProceedingJoinPoint jp){

        try {
            System.out.printf("环绕前");
            Object temp =  jp.proceed();
            System.out.printf("环绕后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }


}
