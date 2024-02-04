package com.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMethods2 {

	public static void main(String[] args) {
		//in this class we are going to apply
		//sorted() method
		//anymach() method
		//none match()method
		//all match()method
		
		List<Integer> numbers=Arrays.asList(1,5,3,8,7,4,9);
	//sorted()method
		List<Integer> sortednumbers=numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortednumbers);
		
		//this is use to sort and print in the reverse order
		List<Integer> sortednumbersreverse=numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortednumbersreverse);
		
		
	//anymatch()method
		//it will return boolean value
		System.out.println(numbers.stream().anyMatch(n->n==8));
		
		List<String> names=Arrays.asList("subhani","rabiya","subhani","subbu","alone");
		System.out.println(names.stream().anyMatch(n->n.equals("rabiy")));
		                 //or
		System.out.println(names.stream().anyMatch(n->{return n.startsWith("rabi");}));
		
	//none match
		System.out.println(names.stream().noneMatch(n->{return n.endsWith("e");}));
		
	//all match
		System.out.println(names.stream().allMatch(n->{return n.startsWith("su");}));
		
	//Findany
		//it will return any element from the stream
		System.out.println(names.stream().findAny().get());
		//this method is optional so we used .get() to print the value
		
	//Findfirst
		//it will return first element from the stream
		System.out.println(names.stream().findFirst().get());
		
		//if the stream is empty then it will throw the "NoSuchElementException"

	}

}
