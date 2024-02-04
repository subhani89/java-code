package com.javaDotLangPackage;

import java.util.Objects;

public class HashcodeMethod {
	String name;
	int rollno;
	String mail;
	public HashcodeMethod(String name, int rollno, String mail) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.mail = mail;
	}
	public static void main(String[] args) {
		HashcodeMethod hc=new HashcodeMethod("subbu",10,"subhani@");
		HashcodeMethod hc1=new HashcodeMethod("subbu",11,"subhani@");
		System.out.println(hc.hashCode());
		System.out.println(hc1.hashCode());
		//before override hashcode()method from object class, the hashcode will be generate
		// with reference of the object class hashcode() method the output will be"1159190947" 
		
			
	}
	
	
	@Override
	public int hashCode() {
		return rollno;
	}
	
	//if we override hashcode()method then the customised hashcode will generate
	//if we return the constant value in the override method,
	//then every object hashcode will generate with same reference number
	//insted of return constant value in the override method we can use roll number
	//because of every student have different rollnumber,
	//then it will stored in the memory with reference of rollnumber it will easy to search.

}
