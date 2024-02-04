package com.MultiDimensionalArray;

public class Logicalproblems {

	public static void main(String[] args) {
		//printing diagonals of a matrix.
		//the output will be 1,5,9
		System.out.print("diagonals of array are :");
		int [][] a= {{1,2,3,4},
				     {5,6,7,8},
				     {9,10,11,12},
				     {13,14,15,16}};
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a[0].length;j++) {
				if(i==j) {
					System.out.print(a[i][j]+" ");
				}
				break;
			}
		}
				
		m1();
		m2();
	}
	public static void m1() {
		//diagonal printing from right to left.
		
		System.out.println();
		
		System.out.print("diagonal of array from right to left :");
		
		int [][] a= {{1,2,3},
			         {4,5,6},
			         {7,8,9}};
		
		int i=0; int j=a.length-1;
		while( i<a.length & j>=0) {
			System.out.print(a[i][j]+" ");
			i++;
			j--;	
		}	
	}	
	public static void m2() {
		//printing the all diagonals from left to right
		// to print the all the diagonal elements in array follow these steps
		//1-we need to find the begining index
		//2-decrese the coloum and increse the row
		//1st for loop for print the 1st half of the diagonal array
		//2nd for lop for the 2nd half diogonal array
		
		int [][] a= {{1,  2,  3,  4},
			         {5,  6,  7,  8},
			         {9,  10, 11, 12},
			         {13, 14, 15, 16}};
		System.out.println();
		System.out.println("all the diogonal elements of an array :");
			     
		for(int i=0;i<a[0].length;i++) {
			int row=0; int col=i;
			while(row<a.length & col>=0) {
				System.out.print(a[row][col]+" ");
				row++;
				col--;
			}
			System.out.println();
			
		}
		for(int i=1;i<a.length;i++) {
			
			int col=a[0].length-1; int row=i;
			
			while(col>=0 & row<a.length) {
				System.out.print(a[row][col]+" ");
				row++;
				col--;
			}
			System.out.println();
		}		
		
	}
}
