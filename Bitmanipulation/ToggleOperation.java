package com.Bitmanipulation;

public class ToggleOperation {

	public static void main(String[] args) {
		    //Toggle operation means interchange,
		    //if there have set it will become unset,
		    //if there have unset it will become set.
	   int	n=23;
	   int i=3;
	         //         n =  0 0 0 1 0 1 1 1
	         //    (1<<3) =  0 0 0 0 1 0 0 0
	         //     n^1<<i=  0 0 0 1 1 1 1 1
	         //the 3rd element of n is unset it will become set,
	         //The value of n^1<<i = 31.
 System.out.println("The numarical value of the 0 0 0 1 1 1 1 1 is : " + (n^1<<i));

              //         n =  0 0 0 1 0 1 1 1
              //    (1<<4) =  0 0 0 1 0 0 0 0
              //     n^1<<i=  0 0 0 0 0 1 1 1
              //the 4th element of n is set it will become unset,
              //The value of n^1<<4 = 7.
System.out.println("The numarical value of the 0 0 0 0 0 1 1 1 is : "+(n^1<<4));

	}

}
