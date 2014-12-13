package org.isol.satish.config;

import org.isol.satish.common.Agent;
import org.isol.satish.output.impl.Bike;
import org.isol.satish.output.impl.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

	@Bean(name="bike")
	public Bike getBike(){
		return new Bike();
	}
	
	@Bean(name="car")
	public Car getCar(){
		return new Car();
	}
	
	@Bean(name="agent")
	public Agent getAgent(){
		Agent ag=new Agent();
		ag.setVehicle(getBike());
		
		return ag;
		
	}
}
