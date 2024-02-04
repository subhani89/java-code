package com.collections;
import java.util.*;
public class LinkedHashSetExample {

	public static void main(String[] args) {
		//duplicates are not allowed
		//insertion order is preserved
		LinkedHashSet hs=new LinkedHashSet();
		hs.add('i');
		hs.add(2);
		hs.add(8);
		hs.add(7);
		hs.add(6);
		hs.add("subbu");
		hs.add(2);
		System.out.println("elements stored in the memory :"+hs);
		System.out.println("The size of the linkedhashset is :"+hs.size());

		
        //it is stored data in the form of Linkedhashmap and 
		//Linkedhashmap stored data in Link of nodes(key,value)
		//LinkedHashset-->LinkedHashmap-->Link of nodes(key,value)
		//but in maps we can store data in key, value but in Hashset we can store only one data
		//so internally hashmap stored the data as a key value and store a dummy value in value position
		//by creating dummy object internalli =new object();
		//it is implimenting the set interface so we can create LinkedHashSet in different ways
		Set<String> s=new LinkedHashSet<>();
		         //or
		Collection<String> c=new LinkedHashSet<>();
		         //or		
		LinkedHashSet<String> h=new LinkedHashSet<>();
		h.add(null);
		h.add("subhani");
		h.add("subbu");
		h.add("subbu");
		h.add("hello");
		h.add("hii");
		System.out.println(h.hashCode());
		System.out.println(h);
	}

}
