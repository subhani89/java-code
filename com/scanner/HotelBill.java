package com.scanner;
import java.util.Scanner;

public class HotelBill {

	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("please choose the item from menu:");
	    String name=s.nextLine();
	    
	    System.out.print("please enter the price of dish:");
	    int cost =s.nextInt();
	    
	    System.out.print("enter no of items to order:");
	    int items =s.nextInt();
	    
	    int bill=0;
	    bill=bill+(cost*items);
	    
	    System.out.println("your total bill amount is :"+ bill);
	    double discount=0;
	    
	    
	    if(bill <500){
	        System.out.println("No discount for your purchase and you bill is:" +bill);
	    }
	    else if(bill >=500 ){
	        discount=bill-(0.1* bill);
	    System.out.println("discounted bill is "+discount);
	    }
	    else if(bill >=2000 ){
	        discount=bill-(0.2* bill);
	    System.out.println("discounted bill is "+discount);
	    }
	    System.out.println("Thanks for visiting");
	    s.close();
	}
}
