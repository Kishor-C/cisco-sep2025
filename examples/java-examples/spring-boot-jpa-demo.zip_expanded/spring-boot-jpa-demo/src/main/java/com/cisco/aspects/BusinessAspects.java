package com.cisco.aspects;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component // this object will be registered in the spring container
@Aspect // this marks the class as aspect 
public class BusinessAspects {

//	@Before("execution (* com.cisco.service.ProfileServiceImpl.*(..))")
//	public void logTime(JoinPoint join) {
//		LocalDateTime time = LocalDateTime.now();
//		System.out.println(join.getSignature()+" called at "+time);
//
//	}
//	
	@Around("execution (* com.cisco.service.ProfileServiceImpl.*(..))")
	public Object logTimeTaken(ProceedingJoinPoint jp) {
		LocalTime before = LocalTime.now();
		Object result = null;
		try {
			result = jp.proceed();
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LocalTime after = LocalTime.now();
		System.out.println("Time taken to complete "+jp.getSignature()+" is "+Duration.between(before, after));
		return result;
	}
}
