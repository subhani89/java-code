package com.Interfaces;

public class Customer {
	//in this customer calss we can acess the implemented methods
	//frome the class by creating the objets. 

	public static void main(String[] args) {
		//if we create object MobileDesigning m=new MobileDesigning();
		//it will go to the MobileDesigning class and implementation will shown
		//in this case abstraction will not achive
		
		Mobile m=new MobileDesigning();
		//if we create object with reference interface like this
		//it will go to direct interface so in the interface there is no implementation methods
		
		MobileDesigning mb=new MobileDesigning();
		//this object is for extra methods in MobileDesigning class
		
		m.Wifi();
		mb.nearbyShare();
		m.Camera();
		Mobile.keyboard(); //this is static method so without creating object we can access

	}

}
