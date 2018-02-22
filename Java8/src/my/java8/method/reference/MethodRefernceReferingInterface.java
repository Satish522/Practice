package my.java8.method.reference;

import java.util.function.BiFunction;

class Arithmetic{  
public static int add(int a, int b){  
return a+b;  
}  
public static float add(int a, float b){  
return a+b;  
}  
public  float add(float a, float b){  
return a+b;  
}  
}

public class MethodRefernceReferingInterface {
	public static void main(String[] args) {  
		BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;  
		BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;  
		BiFunction<Float, Float, Float> adder3 = new Arithmetic()::add;  
		int result1 = adder1.apply(10, 20);  
		float result2 = adder2.apply(10, 20f);  
		float result3 = adder3.apply(11.0f, 20.0f);  
		System.out.println(result1);  
		System.out.println(result2);  
		System.out.println(result3);  
	}  
}
