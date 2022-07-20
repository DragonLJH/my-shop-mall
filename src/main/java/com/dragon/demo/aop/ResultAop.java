package com.dragon.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class ResultAop {
	@Pointcut(value = "execution(* com.dragon.demo.controller..*.*(..))")

	public void brokerAspect() {

	}

	@Before("brokerAspect()")
	public void before(JoinPoint joinPoint) {
		System.out.println("这是前置通知");
		System.out.println("正在执行的目标类是: " + joinPoint.getTarget());
		System.out.println("正在执行的目标方法是: " + joinPoint.getSignature().getName());
	}

	@After("brokerAspect()")
	public void after(JoinPoint joinPoint) {
		System.out.println("这是后置通知");
		System.out.println("正在执行的目标类是: " + joinPoint.getTarget());
		System.out.println("正在执行的目标方法是: " + joinPoint.getSignature().getName());
	}

	@Around("brokerAspect()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("这是环绕通知");
		System.out.println("正在执行的目标类是: " + joinPoint.getTarget());
		System.out.println("正在执行的目标方法是: " + joinPoint.getSignature().getName());
		Object proceed = joinPoint.proceed();
		Object[] args = joinPoint.getArgs();
		Object returnValue = joinPoint.proceed(args);
		System.out.println("#############brokerAspect################");
		System.out.println(returnValue);
		System.out.println("#############brokerAspect################");
		return proceed;
	}

}
