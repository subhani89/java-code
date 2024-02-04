package com.SingleDimensionalArray;

public class ClosestMinMaxCount {

	public static void main(String[] args) {
		//finding the closest min max count
		int []a= {2,3,1,5,6,9,3,6,3,1,2,5,4,9,5,3,7,6,3,2,1};
		int minvalue=Integer.MAX_VALUE;
		int maxvalue=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(maxvalue<a[i]) {
				maxvalue=a[i];
			}
			if(minvalue>a[i]) {
				minvalue=a[i];
			}		
		}
		System.out.println("max value of array :"+maxvalue);
		System.out.println("min value of array :"+minvalue);
		int minmaxcount=1;
		int maxmincount=1;
		int Finalminmaxcount=Integer.MAX_VALUE;
		int Finalmaxmincount=Integer.MIN_VALUE;
		int closestminmax=0;
		//	int []a= {2,3,1,5,6,9,3,6,3,1,2,5,4,9,5,3,7,6,3,2,1};
		for(int i=0;i<a.length;i++) {
			if(minvalue==a[i]) {
				for(int j=i+1;j<a.length;j++) {
					minmaxcount++;
					if(maxvalue==a[j]) {
						if(Finalminmaxcount>minmaxcount) {
							Finalminmaxcount=minmaxcount;
						}
						//System.out.println("mintomaxcount :"+Finalminmaxcount);			
					}
				}
			}
			else if(a[i]==maxvalue) {				
				for(int j=i+1;j<a.length;j++) {
					maxmincount++;
					if(a[j]==minvalue){					
						if(Finalmaxmincount<maxmincount) {
							Finalmaxmincount=maxmincount;
						}
						//System.out.println("maxtomin count :"+Finalmaxmincount);
					}
				}
			}
		}
		if(Finalminmaxcount<Finalmaxmincount) {
			closestminmax=Finalminmaxcount;		   
		}
		else if(Finalminmaxcount>Finalmaxmincount) {
			closestminmax=Finalmaxmincount;
		}
		System.out.println("closest minmax count is :"+closestminmax);

	}

}
