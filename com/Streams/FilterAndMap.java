package com.Streams;

import java.util.Arrays;
import java.util.*;


class Student{
	int rollnumber;
	String name;
	int marks;
	public Student(int rollnumber,String name,int marks) {
		this.rollnumber=rollnumber;
		this.name=name;
		this.marks=marks;
	}
}

public class FilterAndMap {

	public static void main(String[] args) {
		m1();
		m2();

	}
	public static void m1() {
		//in this case we are using both filter and map in same time
		List<Student> studentdetails=new ArrayList<>();
		studentdetails.add(new Student(10,"subhani",75));
		studentdetails.add(new Student(11,"subbu",85));
		studentdetails.add(new Student(12,"naveen",95));
		studentdetails.add(new Student(13,"ayub",35));
		studentdetails.add(new Student(15,"rabiya",76));
		studentdetails.add(new Student(16,"inthu",34));
		studentdetails.add(new Student(17,"babu",100));
		               //or
		//we have another way to create list with objects while creating list
		List<Student> studentdetails2=Arrays.asList(
				new Student(10,"subhani",75),
				new Student(11,"subbu",85),
				new Student(12,"naveen",95),
				new Student(13,"ayub",35),
				new Student(15,"rabiya",76),
				new Student(16,"inthu",34),
				new Student(17,"babu",100));				
				
		
		studentdetails.stream().filter(n->n.marks>35).map(n->n.rollnumber+"->"+n.name).forEach(n->System.out.println(n));
		
		
		
	}
	
	public static void m2() {
		//in this case we are using both filter and map in same time
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7);
		
		numbers.stream().filter(n->n%2==0).map(s->s*3).forEach(s->System.out.println(s));
		
		//so first we created a list then added it to strems and filter the list with condition
		//then the filtered data took into map and manipulate the data with requried condition
		//and collect the data with foreach loop then print the data with printing statement
		
		
		
	}

}
