package com.java.eight.PredefinedFuncIntf;

import java.util.function.Function;

public class FunctionFIExample {

	public static void main(String[] args) {
		/*
		 *  It represents a function which takes in one argument and produces a result.
		 *  The lambda expression assigned to an object of Function type is apply()
		 *  The Function interface consists of the following 4 methods:
		 *  apply(), andThen(), compose(), identity()
		 */
		
		 // Function which takes in a number and returns half of it 
        Function<Integer, Double> half = a -> a / 2.0; 
  
        // apply the function to get the result 
        System.out.println(half.apply(10)); 

	}

}
