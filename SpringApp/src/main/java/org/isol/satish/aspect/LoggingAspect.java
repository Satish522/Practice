package org.isol.satish.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.isol.satish.model.Triangle;

@Aspect
public class LoggingAspect {
	
	
	public void loggingAdvice(){
		System.out.println("This is logging Advice");
	}
	
	
	/*@Before("allTriangleMethods()")
	public void loggingAdvice(JoinPoint joinPoint){
		System.out.println("Before Triangle Method Run");
	}
	
	@Before("args(name)")
	public void stringArgument(String name){
		System.out.println("String argument has been called "+name);
	}
	
	
	@After("args(name)")
	public void afterAdviceFor(String name){
		System.out.println("after Advice of string arguement method work");
	}
	
	@AfterReturning(pointcut="args(name)" , returning="returnString")
	public void afterReturning(String name,String returnString){
		System.out.println("After return string arguement "+name+" it prints . Return value is "+returnString);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void afterThrowing(String name,RuntimeException ex){
		
		System.out.println("After exception thrown "+ex);
	}*/
	
	/*@Around("allGetter()")*/
	
	
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		Object returnValue=null;
		System.out.println("Before Around Advice");
		try {
			returnValue=proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After Around Advice");
		return returnValue;
	}
	
	/*@Pointcut("execution(* get*(..))")
	public void allGetter(){}
	
	
	@Pointcut("within(org.isol.satish.model.Triangle)")
	public void allTriangleMethods(){}*/
}
