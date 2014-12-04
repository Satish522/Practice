package spring.demo;

 
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//It's a bean factory concept to get bean
	//	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape=(Shape)context.getBean("shape");
		shape.draw();
	}

}
