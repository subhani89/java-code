package com.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		// To process the data from collection we use stream concept
		//in java streams is a sequence of elements that you can process 
		//workin with collections of data like arrays,lists
		//we can use streams to Filter and mapping the data in streams
		
		ArrayList<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		l.add(35);
		//we can also add elemets directly into list while creating
		List<Integer> lt=Arrays.asList(10,15,20,25,30,35);
		
		
		//to add the elemets into new list for apply stream concept methods
		List<Integer> evennumbers=new ArrayList<>();
		
		
		//without using the streams we can filter the data by using looping statement
		System.out.print("even numbers by using forEach loop :");
		for(int n:lt) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		
		//with using Streams concept 
		
		evennumbers=lt.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		//lt.stream is used to add the collection to the stream
		// .filter() is use to filter the stream by using (n->n%2==0) lamda expression
		// .collection() is used to collect the data from filtering stream
		//collectors.toList() is used to filter data is stored in list format in collection
		
		System.out.println("even numbers from list by using streams :"+evennumbers);
		
		//with out using empty list we can filter and print the elements
		
		System.err.print("printing even numbers without using empty list :");
		lt.stream().filter(n->n%2==0).forEach(n->System.out.print(n+" "));
		
		//or we can write printing statement like this(System.out::print)
		
		System.out.println();
		lt.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		
		StremsOnStrings();
	}
	public static void StremsOnStrings() {
		//Stream concept on string
		//filter the string with requried lenth
		List<String> l=new ArrayList<>();
		l.add("subbu");
		l.add("subb");
		l.add("sub");
		l.add("su");
		l.add("s");
		System.out.println(l);
		System.err.print("no of strings in the list more than 3 charecters :");
		l.stream().filter(n->n.length()>3).forEach(n->System.out.print(n+", "));
		//n.length()>3 used to filter the string with more than 3charecter
		System.out.println();
		
		
		//filtering the null values from the list
		List<String> ll=Arrays.asList("subhani",null,"subbu","rabiya",null);
		System.out.println(ll);
		System.err.println("after filtering the null values :");
		ll.stream().filter(n->n!=null).forEach(n->System.out.print(n+", "));
		                  //or
		//we can directly store the filter data while creating new list
		//in this case we are creating the new list while filtering 
		List<String> filterdata=ll.stream().filter(n->n!=null).collect(Collectors.toList());
		System.out.println();
		System.err.println("filtering null values by using emptylist :"+filterdata);
		
	}

}
