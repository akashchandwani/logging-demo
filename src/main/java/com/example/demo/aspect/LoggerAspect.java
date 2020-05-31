package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

	private Logger log;

	@Pointcut("execution(public * com.example.demo.service..*(..))")
	public void allMethods() {
	}

	@Before("allMethods()")
	public void before(JoinPoint joinPoint) {
		log = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
		log.trace("[Enter : {}] with args {}", joinPoint.getSignature().toShortString(), joinPoint.getArgs());
	}

	@AfterReturning(pointcut = "allMethods()", returning = "returnValue")
	public void after(JoinPoint joinPoint, Object returnValue) {
		log = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
		Signature signature = joinPoint.getSignature();
		log.trace("[Exit : {}] with return type [{}] and value [{}]", signature.toShortString(),
				((MethodSignature) signature).getReturnType(), returnValue);
	}
}
