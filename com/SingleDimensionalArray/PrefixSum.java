package com.SingleDimensionalArray;
public class PrefixSum {
	public static void main(String[] args) {
		//prefix sum with method 1
		System.out.print("this is from method1 :");
		int []a= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=i;j++) {
			}
			sum=sum+a[i];
			System.out.print(sum+" ");
		}
		System.out.println();
		m1();
		PrintRangeSum();
		PfEven();
	}
	public static void m1() {
		System.out.print("this is from method2 :");
		int []a= {1,2,3,4,5};
		int pf[]=new int[5];
		for(int i=0;i<a.length;i++) {		
			if(i==0) {
				pf[i]=a[i];
			}
			else {
				pf[i]=a[i]+pf[i-1];
			}			
			System.out.print(pf[i]+" ");
		}		
	}
	public static void PrintRangeSum() {
		System.out.println();
		int i;
		int []a= {1,2,3,4,5,6,7,8,9};
		//        0,1,2,3,4,5,6,7,8 index
		//in the range sum we can prefix the array in between the given range
		int l=2; int r=7;
	    int [] pf=new int[9];
	   // int [] range=new int[6];
	    System.out.print("prefix sum of array :");
		for( i=0;i<a.length;i++) {
			if(i==0) {
				pf[i]=a[i];
			}
			else {
				pf[i]=a[i]+pf[i-1];
			}
		System.out.print(pf[i] +" ");
		}
		System.out.println();
		System.out.print("prefix sum between the range of 2to7 :");
	   for( i=2;i<=7;i++) {
		   
		   System.out.print(pf[i]+" ");
	   }
	}
	public static void PfEven() {
		System.out.println();
		//find the pf-even of array means even index elements should be prefix sum
		//the output will be the{9,9,16,16,21,21,24,24,25}
		int a[]= {9,8,7,6,5,4,3,2,1};
		int pf[]=new int[a.length];
		int sum=0;
		System.out.print("pf-even of array is :");
		for(int i=0;i<a.length;i++) {
			if(i==0) {
				pf[i]=a[i];
			}
			else if(i%2==0) {
				pf[i]=a[i]+pf[i-1];				
			}
			else {
				pf[i]=pf[i-1];
			}
			System.out.print(pf[i]+" ");
		}
		
	}
}
