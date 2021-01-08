package com.java.eight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToCollections {

	public static void main(String[] args) {
		/*
		 * After performing the intermediate operations on elements in the stream, we can collect 
		 * the processed elements again into a Collection using the stream Collectors methods.
		 */
		
		//Collect To List
		List<Integer> list = new ArrayList<Integer>();
		 
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0)
                                               .collect(Collectors.toList());
        System.out.println(evenNumbersList);
        
        //Stream elements to an Array
        List<Integer> arrList = new ArrayList<Integer>();
        
        for(int i = 1; i< 10; i++){
        	arrList.add(i);
        }
        Stream<Integer> arrStream = arrList.stream();
        Integer[] evenNumbersArr = arrStream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.println("even number array="+evenNumbersArr);

	}

}
