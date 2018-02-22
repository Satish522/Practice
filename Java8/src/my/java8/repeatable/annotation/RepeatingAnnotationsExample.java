package my.java8.repeatable.annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Games.class)  
@interface Game{
    String name();  
    String day();  
}

@Retention(RetentionPolicy.RUNTIME)  
@interface Games{
    Game[] value();  
}


@Game(name = "Cricket",  day = "Sunday")  
@Game(name = "Hockey",   day = "Friday")  
@Game(name = "Football", day = "Saturday")
class Test{
	
}



public class RepeatingAnnotationsExample {
	public static void main(String[] args) {  
        // Getting annotation by type into an array  
        Game[] game = Test.class.getAnnotationsByType(Game.class);  
        for (Game game2 : game) {    // Iterating values  
            System.out.println(game2.name()+" on "+game2.day());  
        }  
    }  
}
