package com.collections;
import java.util.HashMap;
import java.util.AbstractMap;
public class EachCharCountProblem {

	public static void main(String[] args) {
		//counting the each charecter how may times repeating.
		String s="just wait until time being";
		char []stringToChar=s.toCharArray();
		int count=0;
		//int values;
		HashMap hm=new HashMap();
		for(int i=0;i<stringToChar.length;i++) {
			if(hm.containsKey(stringToChar[i])) {
				count= (int) hm.get(stringToChar[i]);
				count++;
				hm.put(stringToChar[i], count);
			}
			else {
				hm.put(stringToChar[i], 1);
			}			
		}
		System.out.println(hm);
	}

}
