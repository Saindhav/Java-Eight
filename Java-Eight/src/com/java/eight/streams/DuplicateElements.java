package com.java.eight.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		
		// Stream.distinct()
		ArrayList<Integer> numbersList 
	    = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
	  
		List<Integer> listWithoutDuplicates = numbersList.stream()
	            .distinct()
	            .collect(Collectors.toList());
	  
		System.out.println(listWithoutDuplicates);
		
		//Collectors.toSet()
		ArrayList<Integer> listWIthDUplicates 
	    = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
	  
		Set<Integer> setWithoutDuplicates = listWIthDUplicates.stream()
	            .collect(Collectors.toSet());
	  
		System.out.println(setWithoutDuplicates);

	}

}
