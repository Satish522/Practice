package org.isol.satish.model;

public class Triangle {
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		//throw(new RuntimeException());
	}
	
	public String setNameAndReturn(String name){
		this.name=name;
		System.out.println("This is triangle name");
		return name;
	}
	
	

}
