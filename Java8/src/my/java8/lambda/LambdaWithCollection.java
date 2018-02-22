package my.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list=new ArrayList<String>();
		 list.add("Satish");
		 list.add("Swapna");
		 list.add("Nitish");
		 list.add("Swati");
		 System.out.println(list);
		 
		 list.forEach(
				 i -> System.out.println(i)
				 );
		 
		 list.stream().forEachOrdered(System.out::println);
	}

}
