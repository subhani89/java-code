package com.MultiDimensionalArray;

public class Problems {

	public static void main(String[] args) {
		//sum of row wise elements in multi dimensional array
		
		int [][] a= {{2,3,4},
				     {5,6,6}};
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[0].length;j++){
				sum=sum+a[i][j];
			}
		}
		System.out.println("sum of the row wise elements in array  :"+sum);
		//m1();
		//m2();
	//	m3();
	m4();
		//m5();
		//m6();
	}
	
	public static  void m1() {
		//adding the elements in array
		Problems p=new Problems();
		
		int [][] a= {{1,2,3},
				     {4,5,6},
				     {7,8,9}};
		
		int [][] b= {{10,11,12},
				     {13,14,15},
				     {16,17,18}};
		int [][] c= new int[3][3];
		System.out.println("m1 method - sum of the two arrays :");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j] +"  ");
			}
			System.out.println();
		}		
	}
	public static void m2() {
		//create an array with squares with existing array
		System.out.println("m2 method - square of existing array :");
		int [][] a= {{10,15,20},
				     {25,30,35},
				     {40,45,50}};
		
		int [][] b= new int[3][3];
		int j;
 		for (int i=0;i<a.length;i++) {
			for( j=0;j<a.length;j++) {
				b[i][j]=a[i][j];
				b[i][j]=b[i][j] * b[i][j];
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void m3() {
		//comparing two arrays if two elements same then print 1 else 0 in new array
		int [][] a= {{1,3,5},
				     {2,5,8},
				     {5,9,4}};
		
		int [][]b= {{1,4,5},
				    {8,5,4},
				    {8,3,4}};
		int [][] c= new int[3][3];
		System.out.println("m3 method - after comparing the array :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]==b[i][j]) {
					c[i][j]=1;
				}
				else {
					c[i][j]=0;
				}
				System.out.print(c[i][j] +" ");
				
			}
			System.out.println();
		}
	}
	public static void m4() {
		//printing the common elements in an array
		System.out.print("m4 method- commom elements in the Array : ");
		int [][]a= {{1,4,5},
				    {6,9,4},
				    {8,2,12}};
		
		int [][]b= {{1,5,8},
				    {10,15,9},
			        {25,6,7}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<b.length;k++) {
					for(int l=0;l<b.length;l++) {
						if(a[i][j]==b[k][l]) {
							System.out.print(b[k][l] +" ");
						}
					}
				}				
			}
		}
		System.out.println();
	}
	public static void m5() {
		//inter changing the values of an array
		System.out.println("m5 method -inter changing the values of an array :");
		int [][]a= {{1,2,3},
				    {4,5,6},
				    {7,8,9}};
		int [][]b= new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				b[i][j]=a[j][i];
				System.out.print(b[i][j] +" ");
			}
			
			System.out.println();
		}
	}
	public static void m6() {
		int [][]a= {{1,2,3},
			        {4,5,6},
			        {7,8,9}};
		int sum=0;
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a.length;j++) {
				sum+=a[j][i];
			}
			System.out.print(sum+" ");
		}
		System.out.println();
		System.out.println(sum);
	}

}
