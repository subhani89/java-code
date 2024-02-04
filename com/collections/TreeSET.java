package com.collections;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSET {

	public static void main(String[] args) {
		//in this data stored in the form of Treeset-->treemap-->binary tree
		//insertion order is not preserved means automatically sorted internally
		//duplicates not allowed
		//default capacity is 0
		//we can't add null in the Treeset.
		//Treeset->Implements->navigableset->Extends->Sortedset->Extends->set
		//so we can create in different ways
		
		NavigableSet<String> n=new TreeSet<>();
		          //or
		SortedSet<Integer> s=new TreeSet<>();
		          //or
		TreeSet<String> t=new TreeSet<>();
		t.add( "subhani");
		t.add( "subbu");
		t.add( "rabiya");
		t.add( "rabiya");
		System.out.println(t);
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.pollFirst());//to remove 1st element
		System.out.println(t.pollLast());//remove last element
		System.out.println(t);
		t.add( "subhani");
		t.add( "subbu");
		t.add( "rabiya");
		t.add( "rabiya");
		t.add("ttt");
		
		System.out.println(t.subSet("printing elements between :"+"s", "w"));
		//to print the elemets between the specific range we can use subset methos
		//in treeset we have "rabiya" element but the specified range is s-w so the in between range
		//elements are printed
		System.out.println(t);
		
		System.out.println("removing element between range :"+t.subSet("s", "w").remove("ttt"));
		System.out.println(t);
		System.out.println("after reversing elemets :"+t.descendingSet());
		System.out.println(t);
		
		
		

	}

}
