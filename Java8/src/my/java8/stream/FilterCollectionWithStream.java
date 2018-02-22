package my.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import my.java8.lambda.pojo.Product;

public class FilterCollectionWithStream {
	static List<Product> productsList=null;
	public static void main(String[] args) {
		productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		Set<String> set = productsList.stream().filter(p -> p.name != null).map(p -> p.name)
				.collect(Collectors.toSet());

		// System.out.println(set);

		//streamIterate();
		
		streamReduce();
		
		streamWithCollectors();
		
		streanWithMethodReference();
		
		//System.out.println(Product::getPrice);
	}

	private static void streanWithMethodReference() {
		List<Float> productPriceList =   
                productsList.stream()  
                            .filter(p -> p.price > 30000) // filtering data  
                            .map(Product::getPrice)         // fetching price by referring getPrice method  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList);
		
	}

	private static void streamWithCollectors() {
		// with collectors class having util methods
		int total=productsList.stream().map(p->p.price).collect(Collectors.summingInt(p->p.intValue()));
		System.out.println("Collectors total "+total);
		
	 
	}

	private static void streamReduce() {
		// sum amount on stream
		float totalPrice = productsList.stream()
                .map(product->product.price).distinct()
                .reduce(1f,(sum, price)->sum*price);
		
		
		System.out.println(totalPrice);
		float totalPrice2 = productsList.stream()  
                .map(product->product.price)  
                .reduce(0.0f,Float::sum);
		System.out.println(totalPrice2);
	}

	private static void streamIterate() {
		// Iterate over array.
		Stream.iterate(-10, element -> element + 1).filter(p -> p >= -5 && p <= 5).limit(20)
				.forEach(System.out::println);
	}
}
