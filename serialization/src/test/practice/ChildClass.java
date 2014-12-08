package test.practice;

import java.util.ArrayList;
import java.util.List;

public class ChildClass extends ParentClass {

	
	private List<String> props;

	public List<String> getProps() {
		return props;
	}

	public  void setProps(List<String> props) {
		this.props = new ArrayList<String>();
	}
	
	public static void makeSomething(){
		System.out.println("Make Something in Child Class");
	}
	
	public static void main(String arg[]){
		
		ChildClass cc=new ChildClass();
		
		ParentClass pc=new ParentClass();
		
		ParentClass pcc=cc;
		
		
		ParentClass pccc= new ChildClass();
		
		System.out.println(pcc.hashCode()+"  ::  "+cc.hashCode());
		
		pc.makeSomething();
		
		pccc.makeSomething();
		
		cc.makeSomething();
		 
		
	}
	
	
}
