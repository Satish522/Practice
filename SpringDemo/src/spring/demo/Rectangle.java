package spring.demo;

public class Rectangle implements Shape {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	
	
	
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



	public Point getPointD() {
		return pointD;
	}



	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}



	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Point Value is ("+getPointA().getX()+","+getPointA().getY()+")");
		  System.out.println("Point Value is ("+getPointB().getX()+","+getPointB().getY()+")");
		  System.out.println("Point Value is ("+getPointC().getX()+","+getPointC().getY()+")");
		  System.out.println("Point Value is ("+getPointD().getX()+","+getPointD().getY()+")");
	}

}
