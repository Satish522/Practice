package org.isol.satish.service;

import org.isol.satish.aspect.LoggingAspect;
import org.isol.satish.model.Circle;
import org.isol.satish.model.Triangle;

public class ShapeServiceProxy extends ShapeService {

	public Triangle getTriangle(){
		new LoggingAspect().loggingAdvice();
		return super.getTriangle();
	}
		
	
}
