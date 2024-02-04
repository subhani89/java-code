package com.exceptionHnadling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchMethod {

	public static void main(String[] args) throws Exception {
		//exception is unexpected abnormal situation that occurs while executing the program
		//we use try catch blocks to catech the exception
		//if we dont use try catch method after the  exception
		//remaining the code doesnt execute
		//we can use "thows" key word to catch the compile time errors
		//this throws used at after method signature example "Exception"
		//when we throws particular exception at method signature it will handle only that exception
		//when you use "Exception" insted of name of exception it will handle any type of exception
		//instead of "exception" we can use "throwble" also it will handle all the exceptions
		
		int s=10;
		int i=0;
		System.out.println("before exception start");
		
		try {
			System.out.println("Arithmetic operation of 2 numbers :"+s/i);
			//in the try block put the code which is maybe can cause the exception
		}
		catch(ArithmeticException  | ArrayStoreException e) {
			
			//throw ec;
			//when ever the exception cant handle anymore then we can throw the exception,
			//by using "throw" command
			//to the compailer and compiler will be stop the execution of code
			//we can catch multiple Exceptions at one catch block by using "|" this character
			//but only one exception name
			
		}
		catch(IndexOutOfBoundsException ib) {
			//we can use multiple catch blocks for multiple exceptions
			
		}
		
		finally {
			System.out.println("finally block in try catch");
			//finally block is optional without finally block we can handle exception
			//even the exception occured finnaly block will always print
			//but in one condition finally block will not print 
			//when you use "System.exit(0)" in try block the thread will destroyed
			//finally block and catch block and remaining code also will not executed
		}
		System.out.println("After exception");
		//because of try catch blocks its able to print this statement otherwise 
		//after execption the execution will be stopped

	}
	//we can use shortcut to create try catch block
	//select the code wich are requried to use in the try catch blocks
	//give the right click in mouse->goto surround with->select requried try catch methods

}
