package com.Interfaces;


interface AddIntegers {
    abstract Integer sum(Integer a, Integer b);
}

public class Main {
    public static void main(String[] args) {
    	AddIntegers a = (x, y) -> x + y;
        a.sum(7, 6);
        System.out.println("Sum of 2 integers :" + a.sum(7, 6));
	
    }
}

