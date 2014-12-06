package spring.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle implements Shape {
	
	private Point pointA;
	
	public Point getPointA() {
		return pointA;
	}
	
	@Autowired
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle.....");
		System.out.println("Co-ordinates are {"+getPointA().getX()+" , "+getPointA().getY()+"}");
	}

}
