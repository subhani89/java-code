package com.Interfaces;

public class MobileDesigning implements Mobile {
	//these are the  unimpliment methods from the  "mobile"interface		
	//not only from interface we can add additional methods to implement

	@Override
	public void Wifi() {
		System.out.println("wifi code");
		
	}

	@Override
	public void Network() {
		System.out.println("network code");
		
	}

	@Override
	public void updates() {
		System.out.println("updates code");
		
	}

	@Override
	public void Os() {
		System.out.println("os code");
		
	}
	@Override
	public void Camera() {
		System.out.println("this is the camera code after implementation start");
	}
	//we can also create additional methods to implemet
	
	public void nearbyShare() {
		System.out.println("nearbyshare code");
		
	}

	

}
