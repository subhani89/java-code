package com.string;

import java.util.Arrays;

public class Stringclass {

	public static void main(String []args) {
		//it is a sequence of charecters and it is a class in java but considerd as literal
		//because of its unique behaviour
		//we can create string in different ways
		//we want compare address of string use == operator
		//to compare text of string use "equals"
		
		String s1="hello";        //this is 1 method
		
		String s2=new String();   //this is another method empty string created
		
		String s3=new String("hello");//string created with some text.
		
		//we can create string in different methods so we can it as literal.
		System.out.println(s3);
		
		System.out.println(s1==s3);//output was false because s1,s3 are different methods. 
		                           //because if we use == operator it will compare address of string
		
		System.out.println("s1,s3 comparision is :"+s1.equals(s3));//output was true because
		
		//when we use "equals" key it will compare text of string, so that it will true.
		
		//StringMethods();
		//StringMethods2();
		StringMethods3();
	}
	public static void StringMethods() {
		//1-startsWith
		//2-endsWith
		//3-contains
		//4-equals
		//5-equalsIgnoreCase.   these are the different methods of string
		String s1="Hello";
		String s2="hello";
		String s3=new String();
		String s4=new String("hello");
		String s5="HELLO";
		
		System.out.println("startswith method :"+s1.startsWith("He"));
		//this method is true because s1 starts with "He"
		//in this method case should be the same
		
		System.out.println("endswith method :"+s1.endsWith("lo"));
		//this method is true because s1 ends with "lo"
		//in this method case should be the same
		
		System.out.println("contains method :"+s1.contains("he"));
		//this method is false because s1 contains "He" upper case text. 
		//in this method case should be the same
		
		System.out.println("equals method :"+s2.equals(s5));
		//this method is false because s1 is mixing of lower and upperclass letters "Hello"
		//int his method case also importent.
		
		
		System.out.println("equalsIgnoreCase method :"+s1.equalsIgnoreCase(s2));
		//this method s1 is "Hello" and s2 is "hello". different cases but it is true
		//because in this method it doent consider cases it only consider and compare text.
		
	}
	public static void StringMethods2() {
		//6-length
		//7-trim
		//8-toCharArray
		//9-toLowerCase
		//10-toUpperCase
		
		String s1="Hello";
		String s2=" hello  ";
		String s3=new String();
		String s4=new String("hello world welcome");
		String s5="HELLO";
		
		
		System.out.println("length method :"+s1.length());
		//to know the no of charecters in string include spaces
		
		System.out.println("trim method :"+s2.trim());
		//to trim the starting and ending spaces.it will not trim middle spaces.
		
		System.out.println("trim and length method :"+s2.trim().length());
		//to count the charecters in array after trim.
		
		System.out.println("to lower case method :"+s5.toLowerCase());
		//this method is used for convert the text from upper case to lower case.
		//s5 has upper case it will convert and print the lower case text. 
		
		System.out.println("to upper case method :"+s2.toUpperCase());
		//this method is used for convert the text from lower case to upper case.
	   //s2 has lower case it will convert and print the upper case text.
		
		char []c=s4.toCharArray();
		//to covert string to char array it needs to create a empty array to store
		System.out.println(c);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
	public static void StringMethods3() {
		//11-indexOf
		//12-lastIndexOf
		//13-subString
		//14-split
		//15-charAt
		//16-replace
		//17-valueOf
		//18-isEmpty
		//19-isBlank
		
		String s1="Hello";
		String s2=" hello  ";
		String s3=new String();
		String s4=new String("hello world welcome");
		String s5="HELLO";
		String s6="hi & goo& ev&ning";
		String s7="143";
		//in s7 we have integer data in string. if we want convert string value in integer
		int i=Integer.valueOf(s7);
		System.out.println("after convertion of string to int value of i :"+i);
		
		int j=1234;
		//we can convert int to string also.
		String str=String.valueOf(j);
		System.out.println("after convertion if int to string :"+str);
		
		
		System.out.println("indexOf method :"+s4.indexOf("d"));
		//this is used to find the index of specific character in string include space
		//it will start count from 0 index
		
		System.out.println("last index of method :"+s2.lastIndexOf("l"));
		//if we use index of method it will show the 1st index of character "l"
		//but in the string we have more than 1 "l" character so in the 
		//last index method it will show the last character index of string.
		
		System.out.println("sub string method :"+s4.substring(5));
		//this methos is used to print the sub string from specific index in this case
		//we mentioned 5 so it will print from index 5 to last charecter
		//if we mention (5,7) it will print sub string from index 5 to 7
		
		System.out.println("split method 1 to print array address :"+s4.split(" "));
		//this method is used to split the string .if we mention (" ") space base
		//but in this method it will split but print only the address of array
		//if we want to print the charectes of split array use below split method.
		
		System.out.println("split method2 to print array :"+Arrays.toString(s4.split(" ")));
		//this method is used to split the string .if we mention (" ") space base
		//it will split by space base.if we mention character like("o") it will split
	    //by o character base.
		
		System.out.println("split method using symble base :"+Arrays.toString(s6.split("&")));
		//this method used to split string using symble base
		//some times some symble are not consider as special charecter like "^" .in that case
		//we use revers slash example ("\\^").
				
		System.out.println("char at method :"+s5.charAt(4));
		//it is used to know the character strored in string with using index
		//so in this case it will print the 4th index character
		
		System.out.println("replace method replace e with s :"+s4.replace('e','s'));
		//it is used to replace the one character to another
		
		System.out.println("replace text :"+s4.replace("world", "subhani"));
		//not only  character we can replace  text also. 
		
		String a1;
		String a2="   ";
		String a3="";
		System.out.println(a2.isEmpty());
		//this is false because a2 has some spaces.in this method it consider spaces
		
		System.out.println(a2.isBlank());
		//this is true because it is emplty string but it doen't contain any text so it is blank
		
		System.out.println(a3.isEmpty());
		//this is true because a3 doen't have any spaces
		
		System.out.println(a3.isBlank());
		//this is true because it doen't contain any text so it is blank
		
	}
	

	
}
