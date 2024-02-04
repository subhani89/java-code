package com.SingleDimensionalArray;

public class ClosestMinmaxLessTimecomplex {

	public static void main(String[] args) {
		//Finding the closest min max count with less time complexity.
		//formula for find is [minmax count=EndIndex-StartIndex+1].
		//{2,1,4,5,3,7,9,4,1,8,6,3,9}
		int [] a= {1,2,3,4,5,6,7,8,9,8,7,1};
		int minvalue=Integer.MAX_VALUE;
		int maxvalue=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(minvalue>a[i]) {
				minvalue=a[i];
			}
			if(maxvalue<a[i]) {
				maxvalue=a[i];
			}
		}
		System.out.println("min value of array :"+minvalue);
		System.out.println("max value of array :"+maxvalue);
		int startindex=0;
		int endindex=0;
		int minmaxcount=0;
		int maxmincount=0;
		int Finalminmaxcount=Integer.MAX_VALUE;
		int Finalmaxmincount=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]==minvalue) {
				startindex=i;
				for(int j=i=1;j<a.length;j++) {
					if(a[j]==maxvalue) {
						endindex=j;	
						minmaxcount=(endindex-startindex+1);
						if(minmaxcount<Finalminmaxcount) {
							Finalminmaxcount=minmaxcount;
							System.out.println("final minmax count :"+Finalminmaxcount);
						}
					}
				}
			}
			if(a[i]==maxvalue) {
				startindex=i;
				for(int j=i+1;j<a.length;j++) {
					if(a[j]==minvalue) {
						endindex=j;
						maxmincount=(endindex-startindex+1);
						if(maxmincount<Finalmaxmincount) {
							Finalmaxmincount=maxmincount;
							System.out.println("final maxmin count :"+Finalmaxmincount);
						}						
					}
				}
				break;
			}			
		}
		if(Finalminmaxcount<Finalmaxmincount) {
			System.out.println("closest minmax count :"+Finalminmaxcount);
		}
		else {
			System.out.println("closest maxmin count :"+Finalmaxmincount);
		}

	}

}
