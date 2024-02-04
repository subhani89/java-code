package com.collections;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		//it is stored data in arrays formate internally
		/*insertion order is preserved that means 
		  without automatic sorting the original order will be print. */
		//duplicate elements are allowed.
		//it's recommended for only accessing the memory.
		//we can store any type of data in the arraylist.
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add('s'); //char data type
		a.add(5);
		a.add(2);
		System.out.println("the Storage formate of arraylist in the memory :" + a);
		
		System.out.println("the size of the Arraylist is :"+a.size());
		System.out.println("the elements in the arraylist are :");
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}

	}

}
