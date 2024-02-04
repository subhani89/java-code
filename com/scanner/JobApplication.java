package com.scanner;

import java.util.Scanner;
public class JobApplication
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("welcome to google");
		System.out.print("Do you want to apply for this job : ");
		String apply = s.nextLine();
		if(apply.equals("no")){
			System.err.println("Thankyou for visiting");
			return;
		}
		else if(apply.equals("yes")){
			System.out.print("Please enter your Name : ");
		}
		String name = s.nextLine();
		System.out.print("Please enter your  Email : ");
		String Email = s.nextLine();
		System.out.println("welcome to job portal.....! , please fill the Details : ");
		System.out.print("what is your higher Qualification : ");
		String Education = s.nextLine();
		System.out.print("year of passing : ");
		int passyear = s.nextInt();
		if(passyear<2020){
			System.out.println("you are not eligible for this job......! ");
			return;
		}
		else if(passyear>=2020 && passyear<=2024) {
			System.out.println("you are eligible for this job.....! ");
		}
		else {
			System.err.println("please enter valid input !");
			return;
		}
		System.out.print("what is your Branch : ");	
		String Branch = s.nextLine();
		switch (Branch) {
		case "civil" : 
			System.out.println("you are not eligible");
			break;
		case "mech" :
			System.out.println("you are not eligible");
			break;
		case "ece" :
			System.out.println("you are not eligible");
		default :
			System.out.println("you are eligible for this job....!");
		}

		System.out.print("mention programing launguages you know : ");		 
		String launguage = s.nextLine();

		System.out.print("Are you comfort with rotational shifts : ");
		String shifts = s.nextLine();
		if(shifts.equals("no")){
			System.out.println("Thank you for your interest we will get back you soon");
			return;
		}
		else if(shifts.equals("yes")){
			System.out.println("Succesfully submitted your application please wait for interview mail.");
			s.close();
		}
		//System.out.println(name +Education + passyear+Branch+launguage+shifts);
	}
}
