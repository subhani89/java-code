package com.Streams;
import java.util.*;


class Objects{
	//this is the object class which is having the employee details
	
	int id;
	String name;
	int salary;
	
	public Objects(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		//this is  the constructor of objects class

	}
}

public class FilteringOnObjects {
	public static void main(String[] args) {
		List<Objects> l=new ArrayList<>();
		l.add(new Objects(100,"subhani",10000));
		l.add(new Objects(101,"rabiya",15000));
		l.add(new Objects(102,"subbu",20000));
		l.add(new Objects(103,"rabi",25000));
		l.add(new Objects(104,"subhani",30000));
		l.add(new Objects(105,"rabiya",35000));
		
		l.stream().filter(n->n.salary>=20000 && n.salary<=30000).forEach(n->System.out.println(n.id+"-"+n.name+"-"+n.salary));
	}
	//in this case we filtering the data in class by using the class objects and constructor
	//we created a class with employee data then created a construcotor of class
	//and  then create list and add the  employee data with using object reference
	//and add the list to the strems and then filter by using the condition and 
	//printing the requried data by using the lamda expression and for each loop

}
