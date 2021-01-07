package com.java.eight.PredefinedFuncIntf;

import java.util.function.Supplier;

public class SupplierFIExample {

	public static void main(String[] args) {
		/*
		 *  It represents a function which does not take in any argument but produces a value of type T.
		 *  This functional interface takes in only one generic namely:- T
		 *  The Supplier interface consists of only one function: get()
		 */
		
		// This function returns a random value. 
        Supplier<Double> randomValue = () -> Math.random(); 
  
        // Print the random value using get() 
        System.out.println(randomValue.get()); 

	}

}
