package spring.demo;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {
	
	private Point center;
	 
	public Point getCenter() {
		return center;
	}
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}




	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle.....");
		System.out.println("Co-ordinates are {"+getCenter().getX()+" , "+getCenter().getY()+"}");
	}

}
