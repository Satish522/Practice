package org.isol.satish;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware,Shape {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;
	
	
	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	@Override
	public void draw(){
		  System.out.println("Point Value is ("+getPointA().getX()+","+getPointA().getY()+")");
		  System.out.println("Point Value is ("+getPointB().getX()+","+getPointB().getY()+")");
		  System.out.println("Point Value is ("+getPointC().getX()+","+getPointC().getY()+")");
	 }



	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		// TODO Auto-generated method stub
		this.context=context;
		System.out.println(context);
		System.out.println(context.toString());
	}



	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("Bean Name is "+beanName);
	}
}
