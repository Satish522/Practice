package test.practice;

import java.util.ArrayList;
import java.util.List;

public class ParentClass {
    
	private List<String> props;

	public List<String> getProps() {
		return props;
	}

	public void setProps(List<String> props) {
		this.props = new ArrayList<String>();
	}
	
	public static void makeSomething(){
		System.out.println("Make Something in Parent Class");
		
	}
	
	 
	
}
