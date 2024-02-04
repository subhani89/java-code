package com.collections;

public class CharCountInStringProblem {
	
	public static void main(String[] args) {
		//counting number of charecters in string
		
		String s="everthing is possible";
		int count=0;
		
		char[] stringToCharArry= s.toCharArray();//stringToChararray is variable name
		
		for(int i=0;i<stringToCharArry.length;i++) {
			System.out.print(stringToCharArry[i]+" ");
			if(stringToCharArry[i] == ' ') {
				count=count--;
			}
			else {
				count++;
			}
		}
		System.out.println();
		System.out.println("The number of charecters in the string is :"+count);

	}

}
