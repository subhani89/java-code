package com.collections;
import java.util.*;
public class HashSetexample {

	public static void main(String[] args) {
		//it is stored data in the form of hashmap and hash map stored data in array of nodes(key,value)
		//Hashset-->Hashmap-->Array of nodes(key,value)
		//but in maps we can store data in key, value but in Hashset we can store only one data
		//so internally hashmap stored the data as a key value and store a dummy value in value position
		//by creating dummy object internalli =new object();
		//insertion order not preserved it means the
		//elements are sorted automatically and printed.
		//duplicates are not allowed.
		//it allows any type of data to store in the hashset.
		HashSet hs=new HashSet();
		hs.add(8);
		hs.add(7);
		hs.add('s');
		hs.add(8.5);
		hs.add(6);
		hs.add(5);
		hs.add(6);//duplicate element not printing in the console
		hs.add("subbu");
		//Iterator it=hs.iterator();
		System.out.println("The storage formate of the hashset in memory :"+hs);
		
		System.out.println("The size of the hashset is :"+hs.size());
		
		HashSet<String> h=new HashSet<>();
		h.add("subbu");
		h.add(null);
		h.add("subhani");
		h.add("nothing");
		h.add("nothing");
		System.out.println(h);
		System.out.println(h.contains(null));
		for (String data : h) {
			System.out.println(data);
		}
		
	}

}
