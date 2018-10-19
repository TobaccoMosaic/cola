package com.hpe;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
	@Around("this(com.hpe.Apple)")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("this is before around advice");
		Object result = pjp.proceed();
		System.out.println("this is after around advice");
		return result;
	}
}
