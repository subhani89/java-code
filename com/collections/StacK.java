package com.collections;

import java.util.Stack;

public class StacK {

	public static void main(String[] args) {
		//stack is extends the vector class
		//so which is avalilable in parent by default available to the child
		//additionally stack have some special methods
		//1-pop
		//2-push
		//3-peak
		//4-search
		
		Stack<Integer> s=new Stack<>();
		//System.out.println(s.size());
		//System.out.println(s.capacity());
		s.add(null);
		s.add(10);	
		s.add(55);
	//	System.out.println(s.capacity());
		//stack is follow the LIFO principles
		//means last in first out so stack have some special methods
		
		System.out.println("showing & deleting the last element in stack is : "+s.pop());
		//it will show the the last element and delete the last element in the stack
		
		System.out.println("Replace last element with :"+s.push(111));
		//to replace the last element in stack
		
		System.out.println("data stored in stack :"+s);
		
		
		System.out.println(s.peek());
		//to print the last element in the stack
		
		System.out.println("data stored in stack :"+s);
		//print the all the elements in the stack
		
		System.out.println("searching object :"+s.search(null));
		//to search the index of element from the last, it will start from 1 not from 0
		
		System.out.println("index of element :"+s.indexOf(null));
		//to print the index of element,it will start from 0
		
		System.out.println("adding element by using push :"+s.push(123));
		//we can use push method also to add the nue elemet in stack
		
		System.out.println(s);
		

	}

}
