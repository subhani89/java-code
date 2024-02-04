package com.MultiDimensionalArray;

public class TransposeMatrix {

	public static void main(String[] args) {
		//Transpose the matrix which means rows will be the colums
		//and colums will be the rows
		
		System.out.println("transpose of matrix");
		int [][] a= {{1,2,3},
		             {4,5,6},
		             {7,8,9}};
		int[][] b=new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				b[i][j]=a[j][i];
				
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	

	}

}
