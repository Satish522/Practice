package org.isol.satish.common;

import org.isol.satish.output.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Traveler {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-module.xml");
		Agent agent=context.getBean("agent",Agent.class);
		agent.getVehicle().getName();
	}

}
