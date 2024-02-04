package com.interviewProblems;

public class Triplets {

	public static void main(String[] args) {
		//find the maximum number of triplets of array
		//which means if i<j<k then it is 1 triplet
		//(0,1,2)(0,3,4)(0,3,5)(0,4,5)(3,4,5) these are indexes of triplets
		//these are the triplets of array
		int []a= {2,6,9,3,4,5};
		int count=0;
		for(int i=0;i<a.length-2;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]<a[j]) {
					for(int k=j+1;k<a.length;k++) {
						if(a[j]<a[k]) {
							count++;
							
						}
					}
				}
			}
		}
		System.out.println("number of triplets of an array is :"+count);
	}
}
 