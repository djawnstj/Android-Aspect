package com.djawnstj.aspect.kotlin

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut

@Aspect
class LogAspect {

    @Pointcut("execution(* com.djawnstj.aspect..*(..))")
    fun debugPointcut() {
    }

    @Around("debugPointcut()")
    fun aroundDebug(joinPoint: ProceedingJoinPoint) {
        println("aroundDebug called: $joinPoint")
        joinPoint.signature
        joinPoint.proceed()
    }

}
