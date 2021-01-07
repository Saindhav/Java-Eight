package com.java.eight.staticVSdefaultMethod;

public class StaticDefaultExpImpl implements StaticDefaultExpInterface {

	public static void main(String[] args) {
		
		StaticDefaultExpImpl sd = new StaticDefaultExpImpl();
		sd.showDefaultMethod();
		
		StaticDefaultExpInterface.showStaticMethod();

	}

}
