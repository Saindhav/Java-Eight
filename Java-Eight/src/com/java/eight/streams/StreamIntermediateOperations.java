package com.java.eight.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamIntermediateOperations {
	/*
	 * Intermediate operations return the stream itself so you can chain multiple methods calls in a row.
	 * e.g.:
	 * filter()
	 * map()
	 * flatMap()
	 * distinct()
	 * sorted()
	 * peek()
	 * limit()
	 * skip()
	 */
	public static void main(String[] args) {
		
		List<String> fruitNames = new ArrayList<>();
		fruitNames.add("Apple");
		fruitNames.add("Orange");
		fruitNames.add("Banana");
		fruitNames.add("Grapes");
		fruitNames.add("Guava");
		fruitNames.add("Mango");
		fruitNames.add("Lime");
		fruitNames.add("Papaya");
		
		
		/*
		 *  Stream.filter()- The filter() method accepts a Predicate to filter all elements of the stream.
		 *  This operation is intermediate, enables us to call another stream operation (e.g. forEach()) on the result.
		 */
		
		
		fruitNames.stream().filter((s) -> s.startsWith("G")).forEach(System.out::println);
		
		/*
		 * The map() intermediate operation converts each element in the stream into another object.
		 */
		
		fruitNames.stream().filter((s) -> s.startsWith("G"))
        									.map(String::toUpperCase)
        										.forEach(System.out::println); 
		
		/*
		 * Stream.sorted() - The sorted() method is an intermediate operation that returns a sorted view of the stream.
		 */
		
		fruitNames.stream().sorted()
        					.map(String::toUpperCase)
        					.forEach(System.out::println);

	}

}
