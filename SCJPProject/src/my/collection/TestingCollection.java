package my.collection;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestingCollection {
	
	public static void main(String[] args) {
		//Fail fast
		//Iterating over same object
		ArrayList<String> al=new ArrayList<String>();
		al.add("XYZ");
		
		for(String s: al) {
			System.out.println(s);
			al.add("ABC");
			al.add("PQR");
		}
		System.out.println(al);
		
		
		//Fail safe 
		//While iterating it takes copy of that object ,
		//Basically all classes of concurrent package are threadsafe 
		CopyOnWriteArrayList<String>  coal=new CopyOnWriteArrayList<String>();
		coal.add("XYZ");
		
		for(String s: coal) {
			System.out.println(s);
			coal.add("ABC");
			coal.add("PQR");
		}
		System.out.println(coal);
	}
}
