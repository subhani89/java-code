package com.SingleDimensionalArray;

public class ReversArray {

	public static void main(String[] args) {
		// Reverse the array
		int i;		
		String [] a= {"chai","coffee","water","coke"};
		System.out.print("reverse array :");

		for( i=a.length-1;i>=0;i--) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
		m1();
	}
	public static void m1() {
		//maximum number from the array
		int []a= {5,2,6,9,3,4};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("maximun number in the array is : " + max);
	}

}
