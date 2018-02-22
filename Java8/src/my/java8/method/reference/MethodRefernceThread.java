package my.java8.method.reference;

public class MethodRefernceThread {
	static int i=10;
	public static void threadStatus(){  
        System.out.println("Thread is running...");
        i++;
    }  
	public static void main(String[] args) {  
	    Thread t2=new Thread(MethodRefernceThread::threadStatus);  
	    t2.start();       
	}  
}
