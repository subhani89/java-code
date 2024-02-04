package com.interviewProblems;

public class Problems {

	public static void main(String[] args) {
		int [] a= {1,1,1,0,1,0,1,1,1,1,1,0};
		int count=0;
		int lcount=0;
		int rcount=0;
		int maxcount=Integer.MIN_VALUE;
		int bp=0; //break point means 1st 0
		int sp=0; //starting point after 0.because to run the for loop
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				bp=i;
				//System.out.println(lcount);
				for(int j=bp+1;j<a.length;j++) {
					if(a[j]==0) {
						sp=bp+1;
						count=lcount+rcount+1;
						System.out.println("consecutive count :"+count);

						if(count>maxcount) {
							maxcount=count;
						}
						else {
							maxcount=Integer.MIN_VALUE;
						}						
							System.out.println("max consecutive count :"+maxcount);
							break;
					}
					rcount++;
				}
				i=sp;
				count=0;
				lcount=0;
				rcount=0;
			}

			lcount++;
		}
	}
}
