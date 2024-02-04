package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	public static void main(String[] args) {
		//flat mapping is to combine the lists and do operations on list
		List<Integer> l=Arrays.asList(1,2,3,4,5);
		List<Integer> l1=Arrays.asList(6,7,8,9,10);
		
		//combining the  lists into another list
		List<List<Integer>> l2=Arrays.asList(l,l1);
		System.out.println(l2);
		
		//by using flat map
		l2.stream().flatMap(n->n.stream().map(s->s*10)).forEach(s->System.out.println(s));
		
		// .flatmap(n->n.stream()) method is collect the individual streams and combine into single stream
		// .map(s->s*10) method is collect the single output from the flat map apply the requried
		//operation with given condition
		//foreach loop print the results
		
		
		//we have another method which to store the sresults in empty list
		List<Integer> ll=l2.stream().flatMap(n->n.stream().map(s->s*10)).collect(Collectors.toList());
		System.err.println(ll+", ");
		
		
		
		
		//flat map on strings
		List<String> sectionA=Arrays.asList("ab","b","c","d");
		List<String> sectionB=Arrays.asList("e","ff","g","h");
		List<String> sectionC=Arrays.asList("i","j","k","l");
		List<List<String>> allstudents=Arrays.asList(sectionA,sectionB,sectionC);
		System.out.println(allstudents);
		
		allstudents.stream().flatMap(n->n.stream()).forEach(s->System.out.print(s+", "));
		//this is the process to combine and print the list
		
		allstudents.stream().flatMap(n->n.stream().map(s->s.chars().count())).forEach(s->System.out.println(s));
		//this is used to count the chars in every string

	}
}
