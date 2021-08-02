package com.java.eight.PredefinedFuncIntf;

import java.util.function.Consumer;

public class ConsumerFIExample {

	public static void main(String[] args) {
		/*
		 * The Consumer Interface represents a function which takes in one argument and produces a result.
		 * They don’t return any value.
		 * T: denotes the type of the input argument to the operation.
		 * Consumer Interface has two functions : accept(), andThen().
		 */
		
		// Defining Consumer Interface to print a number 
        Consumer<Integer> print = n -> System.out.println(n); 
  
        // Implementing print using accept() 
        print.accept(106); 
        
        //TODO : andThen() method needs to be implemented;

	}

}
