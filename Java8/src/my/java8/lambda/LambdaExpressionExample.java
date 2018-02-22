package my.java8.lambda;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable draw= (shape)-> {
			System.out.println("Draw "+shape+" with radi "+8);
		};
		
		draw.draw("Rect");
		
		Sayable saying = (say)-> {
			//System.out.println("Say something which is right. "+say);
			return "Say something which is right.. :-  "+say;
		};
		
		System.out.println(saying.saySomething("Hello , This is Satish"));
		
		//Calculable add=(a,b) -> (a+b); 
		Calculable add = (a,b) -> {return (a+b);};
		
		Calculable substract = (a,b) -> (a-b);
		
		Calculable multiply = (a,b) -> (a*b);
		
		Calculable devide = (a,b) -> (a/b);
		
		System.out.println("Add Result       : "+add.calculate(23, 34));
		System.out.println("Substract Result : "+substract.calculate(23, 34));
		System.out.println("Multiply Result  : "+multiply.calculate(23, 34));
		System.out.println("Devide Result    : "+devide.calculate(23, 34));
	}

}

interface Sayable{
	public String saySomething(String say);
}

interface Calculable{
	public double calculate(int a,int b);
}