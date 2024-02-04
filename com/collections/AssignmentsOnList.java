package com.collections;

import java.util.*;

public class AssignmentsOnList {

	public static void main(String[] args) {
		//m1();
		//m2();
		m3();

	}
	public static void m1() {
		//to print the sum and average of the list {4,5,0,9,8,10}
		//print the sum of even  numbers
		//split the list


		int sum=0;
		int esum=0;
		Vector<Integer> v=new Vector<>();
		v.add(4);
		v.add(5);
		v.add(0);
		v.add(9);
		v.add(8);
		v.add(10);
		System.out.println(v);
		System.out.println("size of the vector :"+v.size());
		for(int i=0;i<v.size();i++) {
			//System.out.print(v.get(i)+"  ");
			sum+=v.get(i);
		}

		System.out.println("sum of the elements in vector :"+sum);
		System.out.println("average of the elements in vector :"+sum/(v.size()));

		for(int i=0;i<v.size();i++) {
			if((v.get(i)%2)==0) {
				esum+=v.get(i);
			}						
		}
		System.out.println("sum of the even numbers in the vector is:"+esum);
		int halfvector=v.size()/2;
		System.out.print("list 1 :");
		for(int i=0;i<halfvector;i++) {				
			System.out.print(v.get(i)+"  ");
		}
		System.out.print("list 2 :");
		for(int i=halfvector-1;i<v.size();i++) {
			System.out.print(v.get(i)+"  ");
		}
		System.out.println();

	}
	public static void m2() {
		//print the duplicate elements

				LinkedList l=new LinkedList();
				l.add("baby");
				l.add("ball");
				l.add("baby");
				l.add("boy");
				l.add("baby");
				l.add("ball");
				l.add("baby");
				l.add("ba");
				l.add("bab");
				l.add("baby");
				l.add("baby");
				l.add("ball");
				LinkedList l1=new LinkedList();
				System.out.println(l);
				int count=1;
				
				for(int i=0;i<l.size();i++) {
					for(int j=i+1;j<l.size();j++) {
						if(l.get(i)==l.get(j)) {
							count+=count;
							l1.add(l.get(j));
							j=l.indexOf(j);
						}
						
					}
				
				}
				System.out.println(l1);
				
	}
	public static void m3() {
		int count=0;
		Vector<Integer> v=new Vector<>();
		v.add(4);
		v.add(4);
		v.add(5);
		v.add(10);
		v.add(0);
		v.add(9);
		v.add(8);
		v.add(10);
		v.add(4);
		v.add(0);
		v.add(10);
		v.add(10);
		
		Vector<Integer> vc=new Vector<>();
		for(int i=0;i<v.size();i++) {
			
				for(int j=i+1;j<v.size();j++) {
					if(v.get(i)==v.get(j)) {						
						vc.add(v.get(j));
						
						if(v.contains(v.get(i))==vc.contains(v.get(i))) {							
							count++;
							if(vc.isEmpty()==vc.contains(v.get(i))) {
								vc.add(v.get(i));
								count++;
							}
						}	
						
					}					
				}			
		}
		System.out.println(vc);
		System.out.println(count);
	}


}
