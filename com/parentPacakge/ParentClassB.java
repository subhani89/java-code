package com.parentPacakge;

public class ParentClassB extends ParentClassA {

	public static void main(String[] args) {
		System.out.println("this is parentclassB");
		m1();
		m2();

	}
	public static void m2() {
		System.out.println("this is m2 method");
	}
	public static void m2(int a) {
		//this is over loading method with having same name but different parameters
	}

}
