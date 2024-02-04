package com.MultiDimensionalArray;

public class SpiralOrder {

	public static void main(String[] args) {
		//printing the matrix in spiral order
		//the output will be the 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
		
		int [][] a= {{1,  2,  3,  4},
			         {5,  6,  7,  8},
			         {9,  10, 11, 12},
			         {13, 14, 15, 16}};
		int row=0;int col=0;
		for(int i=0;i<a.length-1;i++) {
			System.out.print(a[row][col]+"  ");
			col++;			
		}
		System.out.println();
		 row=0; col=a[0].length-1;
		 for(int i=0;i<a.length-1;i++) {
			 System.out.print(a[row][col]+"  ");
			 row++;
		 }
		 System.out.println();
		 row=a.length-1; col=a[0].length-1;
		 for(int i=0;i<a.length-1;i++) {
			 System.out.print(a[row][col]+" ");
			 col--;
		 }
		 System.out.println();
		 row=a.length-1;col=0;
		 for(int i=0;i<a.length-1;i++) {
			 System.out.print(a[row][col]+"  ");
			 row--;
		 }
		 System.out.println();
		 row++; col++;
		 for(int i=1;i<a.length-1;i++) {
			 System.out.print(a[row][col]+"   ");
			 col++;
		 }
		 System.out.println();
		 row=a.length-2;col=a.length-2;
		 for(int i=1;i<a.length-1;i++) {
			 System.out.print(a[row][col]+"  ");
			 col--;
		 }
	}

}
