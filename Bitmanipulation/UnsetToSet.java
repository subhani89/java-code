package com.Bitmanipulation;

public class UnsetToSet {

	public static void main(String[] args) {
	    //if want we perform "|" operation.
		//we need to perform (1<<i) operation.
		//in this operation we dont need ~1<<i operation.
		int n=23;
		int i=3;
System.out.println("The numarical value of the 0 0 0 1 1 1 1 1 is : " +(n|1<<i));
        //         n =  0 0 0 1 0 1 1 1
		//    (1<<3) =  0 0 0 0 1 0 0 0
		//     n&1<<i=  0 0 0 1 1 1 1 1
		//The 3rd element of the n become unset to set.
		//The value of (0 0 0 0 0 1 1 1)this binary number is 31.


	}

}
