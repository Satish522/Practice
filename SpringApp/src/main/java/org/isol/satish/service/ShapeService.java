package org.isol.satish.service;

 
import org.isol.satish.model.Circle;
import org.isol.satish.model.Rectangle;
import org.isol.satish.model.Triangle;

public class ShapeService {

	private Triangle triangle;
	private Circle circle;
	private Rectangle rectangle;
	
	public Triangle getTriangle() {
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
