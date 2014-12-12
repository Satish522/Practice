package org.isol.satish;

import org.isol.satish.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService= context.getBean("shapeService",ShapeService.class);
		System.out.println(shapeService.getTriangle().getName());
	}

}
