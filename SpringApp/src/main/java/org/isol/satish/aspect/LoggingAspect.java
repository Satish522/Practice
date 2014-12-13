package org.isol.satish.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	
	@Before("allTriangleMethods()")
	public void loggingAdvice(JoinPoint joinPoint){
		System.out.println(joinPoint.toString());
		
		System.out.println("Logging Advice Run ...  run get method in Triangle");
	}
	
 
	
	@Pointcut("execution(* get*(..))")
	public void allGetter(){}
	
	
	@Pointcut("within(org.isol.satish.model.Triangle)")
	public void allTriangleMethods(){}
}
