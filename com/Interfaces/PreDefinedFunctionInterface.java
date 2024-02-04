package com.Interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefinedFunctionInterface {

	public static void main(String[] args) {
		//there are 4types of pre defined functional interfaces 
		//1-predicate
		//2-function
		//3-consumer
		//4-supplier
		
		//predicate return only boolean value
		//and internally "test" method implemented
		//so we called p.test
		Predicate<Integer> p=i->i>3;
		System.out.println(p.test(10)); 
		
		//in this function the return type is user defined
		//so we can return any type of data
		//it is internally "apply" method impllemented
		//so we called f.apply
		Function<Integer,Integer> f=a->a*a;
		System.out.println(f.apply(10));
		
		
		//in this function it dont return any data it will consume the data
		//print the input data
		//it is internally "accept" method implimented
		//so we called c.accept method
		Consumer<Integer> c= a-> {
			System.out.println(a);
		
		};
		c.accept(20);
		
		
		//it will supply the value
		//it is internally have "get" method implimented
		//so we called s.get method
		Supplier<Integer> s= ()->10;
			System.out.println(s.get());

	}

}
