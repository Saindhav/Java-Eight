package com.java.eight.misc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodReference {

	public static void main(String[] args) {
		/*
		 * We can refer a method from class or object using class::methodName type syntax.
		 * Method reference are of 4 types.
		 */
		
		/*
		 * 1.
		 * Reference to static method - Used to refer static methods from a class
		 * Math::max equivalent to Math.max(x,y)
		 */
		
		List<Integer> integers = Arrays.asList(1,12,433,5);
		Optional<Integer> max = integers.stream().reduce( Math::max ); 
		max.ifPresent(value -> System.out.println(value)); 
		
		/*
		 * 2.
		 * Reference to instance method from instance - Refer to an instance method 
		 * System.out::println equivalent to System.out.println(x)
		 */
		
		max.ifPresent( System.out::println ); 
		
		/*
		 * 3.
		 * Reference to instance method from class type
		 * Invoke the instance method on a reference to an object supplied by the context
		 * String::length equivalent to str.length()
		 */
		
		/*
		 * 4.
		 * Reference to constructor
		 * ArrayList::new equivalent to new ArrayList()
		 */

	}

}
