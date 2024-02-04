package com.SingleDimensionalArray;

public class LeadersInArray {

	public static void main(String[] args) {
		//finding the leaders in array
		System.out.print("Leaders in an array are :");
		int [] a= {8,5,9,4,2,7,5,1,2};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					i=j;
				}
			}
			System.out.print(a[i]+" ");
			count++;
		}
		System.out.println();
		System.out.println("no of leaders in an array is :"+count);
		m1();
	}

	public static void m1() {
		//finding leaders in array from revers of array
		int [] a= {8,5,9,4,2,7,5,1,2};
		int count=0;
		for(int i=a.length-1;i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				if(a[i]<a[j]) {
					count++;
					i=j;
				}

			}
		}
		System.out.println(count);
	}
}
