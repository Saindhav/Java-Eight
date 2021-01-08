package com.java.eight.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MaxMinExamples {

	public static void main(String[] args) {
		// To find min and max number from stream of numbers, we use Comparator.comparing( Integer::valueOf )
		
		Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .max(Comparator.comparing(Integer::valueOf))
                .get();

		Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .min(Comparator.comparing(Integer::valueOf))
                .get();

		System.out.println("maxNumber = " + maxNumber);
		System.out.println("minNumber = " + minNumber);
		
		//For Object comparison wec create custom comparator.
		List<Employee> employees = new ArrayList<Employee>();
		 
		employees.add(new Employee(1, "Tom", 36));
		employees.add(new Employee(2, "Sam", 46));
		employees.add(new Employee(3, "Elon", 52));
		 
		Comparator<Employee> comparator = Comparator.comparing( Employee::getAge );
		 
		// Get Min or Max Object
		Employee minObject = employees.stream().min(comparator).get();
		Employee maxObject = employees.stream().max(comparator).get();
		 
		System.out.println("minObject = " + minObject);
		System.out.println("maxObject = " + maxObject);

	}

}
