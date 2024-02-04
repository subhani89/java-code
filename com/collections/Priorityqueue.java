package com.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		//Queue is a interface which is extends the collection interface
		//Priority Queue is the class which is implimenting Queue interface
		//this is follow the FIFO principles
		//in priarity Queue always 1st element stored lower integer
		//default initial capacity of priorityQueue is 11
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.offer(5);
		//we can use offer also to add the elements
		pq.add(7);
		pq.offer(9);
		pq.offer(10);
		pq.add(1);
		pq.add(2);
		System.out.println(pq);
		System.out.println(pq.poll());
		//to check 1st element and delete the element from the Queue
		System.out.println(pq);
		System.out.println(pq.peek());
		//check the 1st element in Queue
		System.out.println(pq);
		
		
		
		PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());
		//this is also priarity Queue with "reverseorder" method which is used
		//change the priority from lower integer to highest integer as a priority in Queue

		p.offer(5);
		p.add(7);
		p.offer(9);
		p.offer(10);
		p.add(1);
		p.add(2);
		System.out.println(p);
		p.remove(10);
		//to remove the element
		System.out.println(p);
		
		while(p.isEmpty()==false) {
			System.out.println(p.poll());
		}
		//to print the elements use while loop
	}

}
