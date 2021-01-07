package com.java.eight.misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEach {
	
	public static void main(String[] args) {
		/*
		 * The Java forEach() method is a utility function to iterate over a collection (list, set or map) and stream. 
		 * It is used to perform a given action on each the element of the collection.
		 */
		
		/*
		 * Iterable interface – Iterable.forEach() method is available to all collection classes except Map
		 */
		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango");
	     
		fruits.forEach(System.out::println);
		
		/*
		 * Map interface – This makes forEach() operation available to all map classes.
		 */
		
		Map<String, String> map = new HashMap<String, String>();
		 
		map.put("A", "Apple");
		map.put("B", "Banana");
		map.put("C", "Mango");
		 
		map.forEach((k, v) -> 
		    System.out.println("Key = " + k + ", Value = " + v));
		
		/*
		 * Stream interface – This makes forEach() and forEachOrdered() operations available to all types of stream.
		 */
		List<Integer> numberList = Arrays.asList(1,2,3,4,5);
		Consumer<Integer> action = System.out::println;
		
		numberList.stream()
	    .filter(n -> n%2  == 0)
	    .forEach( action );
	}
}
