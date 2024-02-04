package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequE {

	public static void main(String[] args) {
		// Arraydeque is a class which is implementing the Deque interface
		//Decque interface is extends the Queue interface and Queue is extends collection interface
		//so that we can create Array deque in different types
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		            //or
		Deque<Integer> d=new ArrayDeque<>();
		            //or
		Queue<Integer> q=new ArrayDeque<>();
		//when we create the arraydeque it is internally create a arry with 17 size 
		//and add and remove the elements from both head and tail
		//so we can call it as double ended Queue
		//both linked list and arraydeque classes are implementing the deque interface
		//so in linked list these all methods are available 
		

	//the main use of ArrayDeque is in Queue we can remove elemts from head and add elemets from tail
		//but in the Deque we can add and remove elements from both head tail
		//default size of deque is 17
		//addition methods- add,addfirst,addlast,offer,offerfirst,offerlast,addAll
		//retrivel methods-peek,peekfirst,peeklast
		//removal methods-pool,poolfirst,polllast,remove,removefirst,removelast
		
	//every method has a 1st and last method because in deque we can add,remove elemets from head,tail
		
		ad.add(4);
		ad.addFirst(2);
		ad.addLast(1);
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());//peek and peek first both are smae to check the 1st element
		System.out.println(ad.peekLast());//check the last element
		d.offer(1);
		d.addFirst(101);
		d.addLast(50);
		System.out.println(d);
		System.out.println(d.poll());
		System.out.println(d);
		System.out.println(d.pollFirst());
		//both poll and pollfirst use to delete the 1st element
		System.out.println(d);
		System.out.println(d.pollLast());//to remove last elemet
		System.out.println(d);
	}

}
