package com.java.eight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WaysToCreateStreams {

	public static void main(String[] args) {
		/*
		 * Collection is an in-memory data structure.
		 * Stream is a pipeline in which elements are computed on demand.
		 * User will extract only the values they require from a Stream.
		 * These elements are only produced as and when required.
		 * The terminal operations return a result of a certain type and intermediate operations return the stream itself.
		 * Stream operations can either be executed sequentially or parallel.
		 * When performed in parallel, it is called a parallel stream.
		 */
		
		//Stream.of()
		Stream<Integer> streamInt = Stream.of(1,2,3,4,5,6,7,8,9);
        streamInt.forEach(p -> System.out.println(p));
        
        //Stream.of(array)
        
        Stream<Integer> streamArr = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        streamArr.forEach(p -> System.out.println(p));
        
        //List.stream()
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> listStream = list.stream();
        listStream.forEach(p -> System.out.println(p));
		
        //Stream.generate() or Stream.iterate()
        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(100));
    
            randomNumbers.limit(20)
                 .forEach(System.out::println);
            
            
        //Stream of String chars or tokens
        IntStream stream = "12345_abcdefg".chars();
        stream.forEach(p -> System.out.println(p));
		

	}

}
