package com.javaDotLangPackage;

public class StringBufferclass {
	public static void main(String[] args) {
		//in string classes you cant add data to existing string because strings are unmutable
		//but stringbuffers are mutable we can extend the string size by using "append" keyword
		//default memorysize of stringbuffer is 16
		//whenever string size more than its default size automatically incrsed
		//its incresed by= (actual size+1)*2
		//whenever you store some text while creating string  without using "append" keyword
		//for example    "StringBuffer sb=new StringBuffer("hello");"
		//the "hello" text in above string it will not stored in the 16 defaultsize memory
		//stringbuffer increse memory from 16 to 21 because the total text in the string is 5
		//so that extra space will be created in memory.
		//but whenever you add the text in string by using "append" keyword
		//it will automatically incresed by formula. it not incresed by reference of text. 

		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());

		sb.append("subbu");
		sb.append("subbu");
		sb.append("subbu");
		sb.append("subbu");
		sb.append("subbu");
		sb.append("subbu");
		sb.append("subbu");
		System.out.println(sb.capacity());
		System.out.println(sb.toString());
		
		StringBuffer sb1=new StringBuffer();
		sb1.append("abcdefgh");
		System.out.println(sb1.reverse());
		//revers method used to reverse the string
		//but we cant reverse the data in strings it only possible in stringbuffer.
		

	}

}
