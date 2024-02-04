package com.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class MapInStreams {

	public static void main(String[] args) {
		//in java streams map operation is used to transform each element in a stream
		//according to a specific function
		//it is mainly used to data manipulation
		
		
//in this case we are converting string from lower class to upper class
		List<String> vehicles=Arrays.asList("car","bus","jeep","auto","bike");
		List<String> upperclass=new ArrayList<>();
		
		upperclass=vehicles.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(upperclass);
		
		
		
		//printing the length of strings without apply streams
		for(String name:vehicles) {
			System.out.println(name.length());
		}
		
		
		
		//with using the streams
		//we need to create empty List with integer generics because the result of length is integer 
		List<Integer> length=new ArrayList<>();
		length=vehicles.stream().map(n->n.length()).collect(Collectors.toList());
		System.out.println(length);
		            //or
		vehicles.stream().map(n->n.length()).forEach(n->System.out.print(n+", "));
		            //or
		vehicles.stream().map(n->n.length()).forEach(System.out::println);
		
		
//in this case we are multiplying the data with certain number in the list	

		//without using streams
		for (Integer values : numbers) {
			System.out.print(values*3+", ");
		}
		
		//with iusing streams
		System.out.println();
		numbers.stream().map(n->n*3).forEach(System.out::println);
		              //or
		numbers.stream().map(n->n*3).forEach(n->System.out.print(n+", "));

	}

}
