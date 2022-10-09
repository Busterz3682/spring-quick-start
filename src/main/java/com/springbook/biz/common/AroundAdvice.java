package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {

	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable{
		
		System.out.println("[before] 비지니스 메소드 수행 전 처리할 내용");
		Object returnObj = pjp.proceed();
		System.out.println("[after] 비지니스 메소드 수행 후 처리할 내용");
		
		return returnObj;
	}
	
}
