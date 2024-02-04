package com.SingleDimensionalArray;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PracticeProblems {

	public static void main(String[] args) {
		// Given N array elements check if there exist a pair(i,j)
		//such that A[i]+A[j]==k && i!=j.
		int []A= {3,2,1,4,3,6,8,5,5};
		int k=10;
		for(int i=0;i<A.length;i++) {
			for(int j=i+1;j<A.length;j++) {
				if((A[i]+A[j]==k) && (A[i]!=A[j])) {
					System.out.print(A[i]+" ");
					System.out.println(A[j]);
				}
			}
		}
m1();
	}
	public static void m1() {
		//Rotate an arry from last to first by 'k' times
		int [] a= {5,3,6,3,1,8,6,9,7};
		int []b=new int[9];
		int k=3;
		//so wee need to start the array with last 3 elements because k=3.
		//the output will be the {7,9,6,5,3,6,3,1}
		//step 1- we need to reverse the  array first
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		  b[i]= a[i];
		}
		System.out.println();
		for(int i=2;i>=0;i--) {
			System.out.print(b[i]);
		}
		System.out.println();
		for(int i=a.length-1;i>=3;i--) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	static void swap(int s2, int e2) {
		int s=0;int e=5;
		 while(s<e) {
			 swap(s,e);
			 s++;
			 e--;
			 System.out.println(a[s]);//this is not completed
		 }

	}

}
