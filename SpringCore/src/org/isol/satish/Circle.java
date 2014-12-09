package org.isol.satish;
 
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

 






import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape  {
	
	private Point center;
	 
	
	public Point getCenter() {
		return center;
	}
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void initializeCircle(){
		System.out.println("Initialize Circle");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Destroy Circle");
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle.....");
		System.out.println("Co-ordinates are {"+getCenter().getX()+" , "+getCenter().getY()+"}");
	}
	 
	

}
