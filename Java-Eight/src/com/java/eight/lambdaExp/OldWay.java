package com.java.eight.lambdaExp;

import com.java.eight.functionalInterface.SayHelloInterface;

public class OldWay implements SayHelloInterface {

	@Override
	public void sayHello() {
		System.out.println("Saying Hello To You In Old Style !!");
	}

}


