package com.java.eight.lambdaExp;

import com.java.eight.functionalInterface.AdditionInterface;
import com.java.eight.functionalInterface.SayHelloInterface;
import com.java.eight.functionalInterface.SquareInterface;

public class Test {
	
	public static void main(String[] args) {
		OldWay ow = new OldWay();
		
		SayHelloInterface ni1 = new OldWay();
		ow.sayHello();
		ni1.sayHello();
		
		/*
		 * Using lambda expression to call SayHelloInterface
		 */
		SayHelloInterface newWay = () -> System.out.println("Saying Hello To You In Lambda Style !!");
		newWay.sayHello();
		
		/*
		 * Using lambda expression to call AdditionInterface
		 */
		AdditionInterface addI = (a,b) -> System.out.println("The sum is :"+(a+b));
		addI.add(5, 4);
		
		/*
		 * Using lambda expression to call SquareInterface
		 */
		SquareInterface sIntf = (n) -> n*n;
		System.out.println(sIntf.sqaureOf(6));
	}
	
	
	
}
