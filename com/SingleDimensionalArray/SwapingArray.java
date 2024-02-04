package com.SingleDimensionalArray;

import java.util.Collection;

public class SwapingArray {

	public static void main(String[] args) {
		// Swaping Array without using empty array
		
		//System.out.println(A[i]);
		//System.out.println(A[j]);
		//swap(null, 0, 0);
		swap();
	}

	public static void swap() {
		// TODO Auto-generated method stub
		int A[]= {1,2,3,4,5,6,7};
		int i=0; int j= 7;
		while(i<j) {
			swap(A,1,7);
			i++;
			j--;
		}
		//A[i]=A[i]+A[j];
		System.out.println(A[i]);
		System.out.println(A[j]);
		
	}//this is not correct method this method needs to be improve

}
