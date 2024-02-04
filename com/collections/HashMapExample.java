package com.collections;
import java.util.*;
import java.util.Map.Entry;
public class HashMapExample {

	public static void main(String[] args) {
		//insertion order is nor preserved it automatically sorted.
		//duplicate not allowed because
		//the final assigned value will be print like("3","1")then("3","3")
		//so the finally the 1 is replaced with 3 and printed("3","3").
		HashMap<String,String> hm=new HashMap<>();
		hm.put("subbu","1");
		hm.put("3","1");
		hm.put("3","1");//3value equals 1 at starting
		hm.put("s","5");
		hm.put("0@","@0");
		hm.put("subbu","1");
		hm.put("jani","1");
		hm.put("3","3");//then 3value replaced with 3 then final value printed
		hm.put("1","3");
		hm.put("2","4");
		hm.put("5","3");
		hm.put("4","3");
		
		System.out.println("elements in hashmap :"+hm);
		
		System.out.println("The size of the hashmap is :"+hm.size());
		
		//to get the value by using key
		System.out.println(hm.get("subbu"));		
		System.out.println(hm.get("s"));
		
		//verification of key in map
		System.out.println(hm.containsKey("3"));//it will return true
		System.out.println(hm.containsKey(3));
		//it will return false because there is no integer key in map
		System.out.println(hm.containsValue("@0"));//check by using value
		
		//removing of element from map
		hm.remove("jani");
		
		//to replace the elements
		hm.replace("subbu","1000");
		System.out.println(hm);
		
		//by using this it will check the key is already existed or not
		//if same key is already existed then it will not replace if not existed then only add
		hm.putIfAbsent("1","3");
		

		
		//by using entry set we can get the key and values in map by using for each loop
		//retrival of keys vlaues from map
		Set<Entry<String,String>> entries=hm.entrySet();
		for (Entry<String, String> entry : entries) {
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"  >>>  "+value);
			
		}
		
		//retrival of keys from map
		Set<String> keys=hm.keySet();
		for (Entry<String, String> entri : entries) {
			System.out.println(entri);
		}
		
		//retrival of values
		Collection<String> value=hm.values();
		for (String string : value) {
			System.out.println(string);
		}
	}

}
