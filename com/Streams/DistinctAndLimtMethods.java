package com.Streams;


import java.util.stream.Collectors;
import java.util.*;

public class DistinctAndLimtMethods {

	public static void main(String[] args) {
		//Distinct is a non terminal method is used to remove the dublicate elemets in the stream
		//an then by using terminal methods we can collect the remainimg data
		
		List<String> names=Arrays.asList("subhani","rabiya","subhani","subbu","alone");
		
		List<String> filterednames=names.stream().distinct().collect(Collectors.toList());
		System.out.println("After filtering the duplicates :"+filterednames);
		                    //or
		//we can directly print without using empty list
		names.stream().distinct().forEach(n->System.out.println(n));
		
	//count() method
		//this is the teminal method
		//we can count the elemets after filtering by using count method
		//it will return the "long" data type value so we can store it in the long datype variable
		long NoOfCount=names.stream().distinct().count();
		System.err.println("no of persons in the list without duplication :"+NoOfCount);
		System.out.println("Total no of persons in the list :"+names.size());
		
	//limit() method
		//this os the non terminal method use to print the requried number of elements in list
		
		names.stream().limit(2).forEach(n->System.out.println(n));
		//in this method i have set the limit is 2 so that only 2 elements in the list are printed
		
	//max() method
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7);
		Optional<Integer> max=numbers.stream().max((num1,num2)->{return num1.compareTo(num2);});
		//in this case we create list as a optional
		System.out.println("maximum number in list :"+max.get());
		//we used optional list so that we need to max.get() method in printing statement
		
	//min()method
		Optional<Integer> min=numbers.stream().min((num1,num2)->{return num1.compareTo(num2);});
		System.out.println("minimum number from the list :"+min.get());
		
		
	//reduce()method
		//it is used to collect the elements from the list and combine in a single element
		List<String> alfa=Arrays.asList("a","b","c","d","e","f");
		Optional<String>alfabets=alfa.stream().reduce((alfa1,alfa2)->{return (alfa1+alfa2);});
		System.out.println(alfabets.get());
		
		
	//toArray()method
		//to convert the string list into array
		Object[] arr=alfa.stream().toArray();
		System.out.println(Arrays.toString(arr));

	}

}
