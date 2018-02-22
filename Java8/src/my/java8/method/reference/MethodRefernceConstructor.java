package my.java8.method.reference;

interface Messageable{  
	Message getMessage(String msg);  
}  
class Parent {
	public Parent() {
		System.out.println("This is parent");
	}
}
class Message extends Parent{  
    Message(String msg){
    	 
        System.out.print(" , Welcome to constructor.");  
    }  
} 

public class MethodRefernceConstructor {
	
	public static void main(String[] args) {  
		//Message p=new Message("sdsd");
		 
		Messageable hello = Message::new;
		hello.getMessage("Hello");
    } 
	
}
