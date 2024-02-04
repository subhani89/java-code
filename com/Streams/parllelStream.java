package com.Streams;


import java.util.*;

class Employee{
	String name;
	int salary;
	public Employee(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
}

public class parllelStream {
	public static void main(String[] args) {
		List<Employee> employe=Arrays.asList(
				new Employee("subhani",10000),
				new Employee("rabiya",15000),
				new Employee("babu",20000),
				new Employee("ayub",25000),
				new Employee("subbu",30000));
		employe.stream().filter(n->n.salary>=20000).limit(2).forEach(s->System.out.println(s.name));
		//this is  normal stream method
		
		employe.parallelStream().filter(n->n.salary>=20000).limit(2).forEach(s->System.out.println(s.name));
		//this is parallel stream the difference between stream and parallel strem is
		//in strem list of elemets are stored in single stream and performed the operations
		//but in the parallel stream the list of some objects are stored in one stream and 
		//remaining list objects are stored in another stream and performed operations paralelly
		//preformance speed will be increased
	}

}
