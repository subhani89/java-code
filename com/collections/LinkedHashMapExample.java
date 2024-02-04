package com.collections;
import java.util.LinkedHashMap;
public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap hm=new LinkedHashMap();
		//insertion order is  preserved so the same order printed without sorting.
		//duplicate not allowed because
		//the final assigned value will be print like("3","1")then("3","3")
		//so the finally the 1 is replaced with 3 and printed("3","3").
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
		System.out.println("storage formate of linkedHashMap");
		System.out.println(hm);
		System.out.println(hm.get("jani"));

	}

}
