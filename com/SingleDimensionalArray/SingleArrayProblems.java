package com.SingleDimensionalArray;

public class SingleArrayProblems {

	public static void main(String[] args) {
		//sum of the integers in array
		int []a = {9,8,7,6,5,4};
		int sum=0;
		for (int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}

	//	System.out.println("sum of array elements :" + sum);
		//m1();
		m2();
		//m3();
	}
	public static void m1() {
		//print the average of the elements
		int [] s= new int[6];
		s[0]=1;   s[1]=2;    s[2]=3;   s[3]=4;   s[4]=5;   s[5]=6;
		int sum=0;
		int ave=0;
		for(int i=0;i<s.length;i++) {
			 sum=sum+s[i];
			 ave=sum/(s.length+1);
		}		
		System.out.println("average of the elements are :" + ave);
	} 
	
	
	
	public static void m2() {
		//given an array of size N count no of elements having at least
		//one element greter than it self.
		
		int [] a= {2,5,1,4,8,0,1,6};
		int count=0;
		
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;) {
				if(a[i]<a[j]) {
				a[i]=a[j];
					count=count+1;
					j=a.length;
				}
				else {
				
					j++;
				}
			}
		}
		System.out.println("no of elements having at least one element greter than it self :"+count);
	}
	
	
	
	
	
	public static void m3() {
		int [] a= {2,5,1,4,8,0,1,6};
		int count =0;
		for(int i=0;i<a.length;i++) {
			count++;
		}
		System.out.println(count);
	}
	
}
