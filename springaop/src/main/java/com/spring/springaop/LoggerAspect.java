package com.spring.springaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	
	@Before("execution(* com.spring.springaop.ShoppingCart.checkout(..))")
	public void beforeLogger() {
		System.out.println("Logger method execution start");
	}
	@After("execution(* com.spring.springaop.ShoppingCart.checkout(..))")
	public void afterLogger() {
		System.out.println("Logger method execution ended");
	}
}
