package com.Interfaces;

public interface Mobile {
	//in this interface it contain empty mandatory methods 
	//if any class want to access this interface 
	//the class must impliment the all the methos in the  interface
	//these methods are created before startig the implimentation
	
	
	public void Wifi();
	
	public void Network(); 
			
	public void updates();
	
	public void Os();
	
	//these are the mandatory implements methods
	//we can't add public methods after starting implementation
	//beacuse after starting implementation if we can create any public method it will
	//effect to the impleneted classes wich are using this interfaces.
	//these conditions are only untill java 1.7
	
	//after java 1.7 means from java 1.8
	//we can add default and static methods also in the interface after implementation
	
	default void Camera() {
		System.out.println("this is the camera code after implementation start");
		LocalFeaters();
	}
	static void keyboard() {
		System.out.println("this is keyboad related code");
		LocalFeaters();
	}
	
	//after java 1.8 means from 1.9 we can create private methods also
	private static void LocalFeaters() {
		System.out.println("local featurs code");
	}


}
