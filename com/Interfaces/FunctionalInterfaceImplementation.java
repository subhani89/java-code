package com.Interfaces;

public class FunctionalInterfaceImplementation implements Functionalinterface {
	public static void main(String[] args) {
		
		Functionalinterface fi=new FunctionalInterfaceImplementation();
		fi.m1();
		fi.m4();
		
	}

	@Override
	public void m1() {
		System.out.println("this is m1 method from functionalinterface implemented in FunctionalInterfaceImplementation class");
		
	}

}
