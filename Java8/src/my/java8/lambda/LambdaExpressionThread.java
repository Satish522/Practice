package my.java8.lambda;

import java.util.Comparator;

public class LambdaExpressionThread{
	
    public static void main(String[] args) {  
      
        //Thread Example without lambda  
        Runnable r1=new Runnable(){  
            public void run(){  
                System.out.println("Thread1 is running...");  
            }  
        };  
         
        //Thread Example with lambda  
        Runnable r2=()->{  
                System.out.println("Thread2 is running...");  
        };  
        Thread t1=new Thread(r1);  
       
        Thread t2=new Thread(r2);  
        t2.start(); 
        t1.start(); 
        
    }
    
}  
