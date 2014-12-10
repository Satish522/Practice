package org.isol.satish;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;



 public class MyEventListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent applicationEvent) {
		// TODO Auto-generated method stub
		System.out.println(applicationEvent.toString());
	}

}
