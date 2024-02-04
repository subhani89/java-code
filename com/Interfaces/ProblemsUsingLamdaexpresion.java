package com.Interfaces;

import java.util.function.Function;

import com.integerClasses.Integer;

public class ProblemsUsingLamdaexpresion {

	public static void main(String[] args) {
		// find the sum of two integers using lamda expression
		Function<Integer,Integer> f=a->a*a;
		System.out.println(f.apply(5));

	}

}
