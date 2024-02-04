package com.SingleDimensionalArray;

public class SubArrays {

	public static void main(String[] args) {
		//printing the sub arrays
		System.out.print("sub arrays of given array are :");
		int []a= {1,2,3,4,5};
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(a[k]);					
				}
				System.out.print(" ");
			}
		}
m1();
m2();
	}
	public static void m1() {
		//printing the sum of the sub arrays
		//by using contribution technique formula we can calculate
		//sum of sub arrays =a[i]*(a.length-1)*(i+1).
		//time complexity of this method is O(n).
		System.out.println();
		int []a= {1,2,3,4,5,6,7,9,-2,7,5};
		int TotalSumOfSubArray=0;
		for(int i=0;i<a.length;i++) {
			TotalSumOfSubArray=a[i]*(a.length-i)*(i+1);
		}
		System.out.println("Total sum of sub arrays :"+TotalSumOfSubArray);
	}
	public static void m2() {
		//calculating sum of sub arrays by using prefix sum
		//time complexity of this method is O(n^2).
		int []a= {1,2,3};
		int pf[]=new int[5];
		for(int i=0;i<a.length;i++) {		
			if(i==0) {
				pf[i]=a[i];
			}
			else {
				pf[i]=a[i]+pf[i-1];
			}			
			//System.out.print(pf[i]+" ");
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(i>0) {
					sum+=pf[j]-pf[i-1];
				}
				else {
					sum+=pf[j];
				}			
			}
		}
		System.out.println("sum of sub arrays by using prefix sum :"+sum);
	
	}

}
