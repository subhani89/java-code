package com.MultiDimensionalArray;

public class Matrix90DegreeRotation {

	public static void main(String[] args) {
		//to rotate matrix 90 degrees 1st we need to transpose the matrix
		//then reverse the matrix 
		//the output will be 90degree matrix

		int [][] a= {{1,2,3},
		             {4,5,6},
		             {7,8,9}};
		int[][] b=new int[3][3];
		//this lop for transpose the matrix.
		System.out.println("transpose of the matrix :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("matrix after 90 degree rotation :");
		//this loop for reverse the transpose matrix.
		//after reverse the transpose matrix the output will be 90degree matrix.
		for(int i=0;i<a.length;i++) {
			for(int j=a[0].length-1;j>=0;j--) {
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();                                                                                                    
		}


	}

}
