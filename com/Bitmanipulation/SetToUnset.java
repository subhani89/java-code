package com.Bitmanipulation;

public class SetToUnset {

	public static void main(String[] args) {
		int n=23;
		//if want we perform & operation.
		//we need to perform ~(1<<i) operation.
		
		int i=4;
System.out.println("The numarical value of the 0 0 0 1 1 1 1 1 is : " +(n&(~(1<<i))));
		//         n =  0 0 0 1 0 1 1 1
		//    (1<<4) =  0 0 0 1 0 0 0 0
		//   ~(1<<4) =  1 1 1 0 1 1 1 1
		//n&(~(1<<i))=  0 0 0 0 0 1 1 1
		//The 4th element of the n become set to unset.
		//The value of (0 0 0 0 0 1 1 1)this binary number is 7.

	}

}
