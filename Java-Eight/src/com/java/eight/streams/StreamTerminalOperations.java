package com.java.eight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOperations {
	/*
	 * Terminal operations return a result of a certain type after processing all the stream elements.
	 * e.g.:
	 * forEach()
	 * forEachOrdered()
	 * toArray()
	 * reduce()
	 * collect()
	 * min()
	 * max()
	 * count()
	 * anyMatch()
	 * allMatch()
	 * noneMatch()
	 * findFirst()
	 * findAny()
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
		 *  Stream.forEach()- The forEach() method helps in iterating over all elements of a stream and perform some 
		 *  operation on each of them. The operation to be performed is passed as the lambda expression.
		 */
		
		
		fruitNames.forEach(System.out::println);
		
		/*
		 * Stream.collect()- collect() method is used to receive elements from a steam and store them in a collection.
		 */
		
		List<String> fruitNamesInUppercase = fruitNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

		System.out.println(fruitNamesInUppercase);
		
		/*
		 * Stream.match() - Used to check whether a given predicate matches the stream elements. 
		 * All of these matching operations are terminal and return a boolean result.
		 */
		
		boolean result = fruitNames.stream()
		        .anyMatch((s) -> s.startsWith("A"));
		 
		System.out.println(result);
		 
		result = fruitNames.stream()
		        .allMatch((s) -> s.startsWith("A"));
		 
		System.out.println(result);
		 
		result = fruitNames.stream()
		        .noneMatch((s) -> s.startsWith("A"));
		 
		System.out.println(result);
		
		
		/*
		 * Stream.count() - terminal operation returning the number of elements in the stream as a long value.
		 */
		
		long totalMatched = fruitNames.stream()
			    .filter((s) -> s.startsWith("G"))
			    .count();
			 
		System.out.println(totalMatched);
			
		/*
		 * Stream.reduce() - Performs a reduction on the elements of the stream with the given function.
		 * The result is an Optional holding the reduced value.
		 */
			
		Optional<String> reduced = fruitNames.stream()
			        .reduce((s1,s2) -> s1 + "#" + s2);
			 
		reduced.ifPresent(System.out::println);

	}

}
