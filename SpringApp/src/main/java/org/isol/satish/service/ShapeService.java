package org.isol.satish.service;

 
import org.isol.satish.aspect.Loggable;
import org.isol.satish.aspect.LoggingAspect;
import org.isol.satish.model.Circle;
import org.isol.satish.model.Rectangle;
import org.isol.satish.model.Triangle;

public class ShapeService {

	private Triangle triangle;
	private Circle circle;
	private Rectangle rectangle;
	
	//@Loggable
	public Triangle getTriangle() {
		new LoggingAspect().loggingAdvice();
		System.out.println("getTriangle method called");
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Rectangle getRectangle() {
		return rectangle;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	
	
	
	

}
