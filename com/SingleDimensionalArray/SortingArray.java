package com.SingleDimensionalArray;

public class SortingArray {

	public static void main(String[] args) {
		System.out.print("before sorting the array  : " );


		int i;
		int [] a=new int[4];
		a[0]=2; a[1]=1; a[2]=4; a[3]=3;
		for( i=0;i<a.length;i++) {
			System.out.print(a[i] );		
		}
		System.out.println();
		System.out.print("after sorting array : ");
		
		for(i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int sort=0;
					sort=a[i];
					a[i]=a[j];
					a[j]=sort;		
				}

			}
			System.out.print(a[i]);
		}


	}

}
