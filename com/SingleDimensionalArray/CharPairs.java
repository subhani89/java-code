package com.SingleDimensionalArray;

public class CharPairs {

	public static void main(String[] args) {
		//calculate the no of(s,k) pairs such that(i<j)
		char [] c= {'a','k','s','l','k','k','m','s','z','k'};
		int count=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]=='s') {
				for(int j=i+1;j<c.length;j++) {
					if(c[j]=='k') {
						count=count+1;
					}
				}
			}			
		}
		System.out.println("no of S,K pairs in an array :"+count);
		m1();
		m2();
	}
	
	public static void m1() {
		//no of (s,k) pairs from array by using conditional operators
		char [] c= {'a','k','s','l','k','k','m','s','z','k'};
		int count=0;
		for(int i=0;i<c.length;i++) {
				for(int j=i-1;j>=0;j--) {
					if(c[i]=='s' && c[j]=='k') {
						count=count+1;
					}
					
				}			
		}
		System.out.println("no of S,K pairs in an array :"+count);
	}
	
	public static void m2() {
		//s,k pair by using reversing the array
		char [] c= {'a','k','s','l','k','k','m','s','z','k'};
		int kcount=0; int pairs=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]=='k') {
				kcount+=1;
			}
			if(c[i]=='s') {
				pairs+=kcount;
			}
		}
		System.out.println("no of S,K pairs in an array :"+pairs);
	}	
}
