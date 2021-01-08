package com.java.eight.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamShortCircuitOperations {

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
		 * These operations are performed on all elements inside a collection satisfying a Predicate.
		 * Whenever a matching element is encountered during iteration, we can break the operation.
		 */
		
		/*
		 * Stream.anyMatch() - return true once a condition passed as predicate satisfies. 
		 * Once a matching value is found, no more elements will be processed in the stream.
		 */
		
		boolean matched = fruitNames.stream()
		        .anyMatch((s) -> s.startsWith("M"));
		 
		System.out.println(matched);
		
		/*
		 * Stream.anyMatch() - method will return the first element from the stream
		 * and then it will not process any more elements.
		 */
		
		String firstMatchedName = fruitNames.stream()
	            .filter((s) -> s.startsWith("O"))
	            .findFirst()
	                        .get();
	 
		System.out.println(firstMatchedName);

	}

}
