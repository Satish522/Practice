package my.java8.filter;

import java.util.ArrayList;
import java.util.List;

import my.java8.lambda.pojo.Product;

public class JavaStreamExample {
	 public static void main(String[] args) {  
		 	String str="Hello , I am Satish Java Developer";
		 	System.out.println("First"+str.substring(str.length())+"method");
		 	System.out.println("Second"+str.substring(2,2)+"method");
		 	System.out.println("Second"+str.substring(-2,2)+"method");
		 	
		 	
	        List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        productsList.stream()  
	                    .filter(p ->p.price> 30000)   // filtering price  
	                    .map(pm ->pm.price)          // fetching price  
	                    .forEach(System.out::println);  // iterating price  
	 }
}
