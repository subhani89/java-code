package com.collections;
import java.util.*;
public class Linkedlistexample {

	public static void main(String[] args) {
		//it is stored data in node format and every node has 3parts these are previous,next,data
		//every node is linked with another by using next,previous blocks
		/*insertion order is preserved that means 
		  without automatic sorting the original order will be print.*/
		//Duplicate elements are allowed.
		/*It's recommended when always use add and delete function 
		  in the Linkedlist*/ 
		//we can store any type of data in linkedlist.
		//it is not synchornized so it will allow multi threading concept
		//by using this "Collections.synchronizedlist(l);" we can stop multi threading
		//it is implementing the Deque interface so that deque methods are available in linked list
		//it is double ended linkedlist
		        //addition methods- add,addfirst,addlast,offer,offerfirst,offerlast,addAll
				//retrivel methods-peek,peekfirst,peeklast
				//removal methods-pool,poolfirst,polllast,remove,removefirst,removelast
		
		LinkedList l=new LinkedList();
		l.add(5);
		l.add(4);
		l.add(3.5); //double data type
		l.add(2);
		l.add('s'); //char data type
		l.add(1);
		l.add(1); //This is duplicate element
		
		
		System.out.println("The storage formate of the Linkedlist is :"+l);
		
		System.out.println("The size of the Linkedlist is :"+l.size());
		
		System.out.print("The elements in the linkedlist are :");
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+" ");		
		}
		System.out.println();
		
		//by using for each loop we can print the elements in list
		for (Object list : l) {
			System.out.print(list+"  ");
			//this os for each loop
		}
		
		System.out.println();
		System.out.println(l.remove(3.5));//to remove the element
		System.out.println(l);
		System.out.println(l.contains('s'));
		
		
		
		//LinkedList<String> ll=new LinkedList<>();
		
				//we can create list with using generic it means <string> .
				//when we use generics with specific data type we can add only that generic data type
				//in the linkedlist
				//without using generic in the linkedlist we can add any type of data
				
				ArrayList<String> a=new ArrayList<>();
				a.add(null);
				a.add(null);
				a.add(null);
				
				//we can add entire colletion in the  linked list
				//l.addAll(a);
				
			
	}
}
