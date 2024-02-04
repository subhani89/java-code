package com.Interfaces;


//if we declered as it is a functional interface with annoation "@FunctionalInterface" 
//it dont allow more than 1 abstract method in the interface
//if you create more than one interface it will  show the error

@FunctionalInterface 
public interface Functionalinterface {
	public abstract void m1();
	public static void m2() {

	}
	public static void m3() {

	}
	// we can create multiple static methods in functional interface
	default void m4() {
		System.out.println("this is default m4 method from Functionalinterface");

	}
	default void m5() {

	}
	//we can create multiple default methods also we dont get any error


}
