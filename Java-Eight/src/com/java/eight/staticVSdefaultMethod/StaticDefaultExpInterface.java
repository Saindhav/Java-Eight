package com.java.eight.staticVSdefaultMethod;

public interface StaticDefaultExpInterface {
	
	/*
	 * Before Java 8, interfaces could have only abstract methods. The implementation of these methods has to be
	 * provided in a separate class. So, if a new method is to be added in an interface, then its implementation
	 * code has to be provided in the class implementing the same interface.
	 * To overcome this issue, Java 8 introduced the concept of default methods which allow the interfaces to 
	 * have methods with implementation without affecting the classes that implement the interface.
	 */
	
	
    default void showDefaultMethod() 
    { 
      System.out.println("Default Method Executed"); 
    }
    
    /*
     * Static Methods are defined in the interface with the keyword static.
     * Static methods contain the complete definition of the function and since the definition is complete and the
     * method is static, therefore these methods cannot be OVERRIDDEN or changed in the implementation class.
     * Similar to Default Method, static method can be defined in the interface, but cannot be overridden in 
     * Implementation Classes.
     * To use a static method, Interface name should be instantiated with it, as it is a part of the Interface only.
     */
    
    static void showStaticMethod() 
    { 
        System.out.println("Hello, New Static Method Here"); 
    } 

}
