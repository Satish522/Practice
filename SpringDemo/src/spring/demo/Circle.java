package spring.demo;

public class Circle implements Shape {
	
	private Point pointA;
	
	public Point getPointA() {
		return pointA;
	}

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
