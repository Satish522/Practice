package test.practice;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Employee implements Serializable{

	String id;
	String name;
	float salary;
	
	public Employee(String id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
    public String toString(){
        return "Employee{name="+name+",id="+id+",salary="+salary+"}";
    }
	
}
