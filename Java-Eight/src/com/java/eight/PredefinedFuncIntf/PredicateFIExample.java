package com.java.eight.PredefinedFuncIntf;

import java.util.function.Predicate;

public class PredicateFIExample {

	public static void main(String[] args) {
		/*
		 * Predicates takes and argument and returns boolean.
		 */
		Predicate<Integer> pr = a -> (a > 18); // Creating predicate  
        System.out.println(pr.test(10));    // Calling Predicate method 

	}

}
