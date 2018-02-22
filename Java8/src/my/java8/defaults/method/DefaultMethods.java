package my.java8.defaults.method;

interface Sayable{  
    // Default method   
    default void say(){  
        System.out.println("Hello, this is default method");  
    }  
    // Abstract method  
    void sayMore(String msg);  
}  

@FunctionalInterface
interface Saying {
	default void say1() {
		System.out.println("Hello , this is another default method");
	}
	
	 void saying();
	public static void said() {
		System.out.println("I said, 'Hello'");
	}
}

public class DefaultMethods implements Sayable {
	 	public void sayMore(String msg){        // implementing abstract method   
	        System.out.println(msg);
	    }
	   
	 	public void xyz(){        // implementing abstract method   
	        System.out.println("Just Saying");
	    }
	 	
		public static void main(String[] args) {
	        DefaultMethods dm = new DefaultMethods();
	        dm.say();   // calling default method  
	        dm.sayMore("Work is worship");  // calling abstract method
	        System.out.println("Default methods");
	        Saying said=new DefaultMethods()::xyz;
	        said.saying();
	    }
		
}
