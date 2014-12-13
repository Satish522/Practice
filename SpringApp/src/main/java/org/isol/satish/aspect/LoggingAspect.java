package org.isol.satish.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	
	@Before("allGetter() && allTriangleMethods()")
	public void loggingAdvice(){
		System.out.println("Logging Advice Run ...  run get method in Triangle");
	}
	
	@Before("allGetter()")
	public void secondAdvice(){
		System.out.println("Second Advice Run ...  ");
	}
	
	 
	
	@Pointcut("execution(* get*(..))")
	public void allGetter(){}
	
	
	@Pointcut("within(org.isol.satish.model.Circle)")
	public void allTriangleMethods(){}
}
