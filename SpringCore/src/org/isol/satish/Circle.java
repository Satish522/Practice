package org.isol.satish;
 
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
 
 
@Component
public class Circle implements Shape,ApplicationEventPublisherAware  {
	
	private Point center;

	@Autowired
	private MessageSource messageSource;
	 
	private ApplicationEventPublisher eventPublisher;
	
	public Point getCenter() {
		return center;
	}
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public MessageSource getMessageSource() {
		return messageSource;
	}
	
	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
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
		DrawEvent drawEvent=new DrawEvent(this);
		eventPublisher.publishEvent(drawEvent);
		System.out.println(this.messageSource.getMessage("drawing", null , "Message not availble", null));
		System.out.println(this.messageSource.getMessage("coordinates", new Object[]{ center.getX(), center.getY() } , "Message not availble", null));
		
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher eventPublisher) {
		// TODO Auto-generated method stub
		this.eventPublisher=eventPublisher;
	}
	 
	

}
