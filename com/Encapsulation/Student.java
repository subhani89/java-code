package com.Encapsulation;

public class Student {
	private String name;
	private int rollnumber;
	private boolean attended;
	
	public Student(int rollnumber) {
		this.rollnumber=rollnumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnumber() {
		System.out.println("100 attended class");
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public boolean isAttended() {
		return attended;
	}
	public void setAttended(boolean attended) {
		this.attended = attended;
	}

}
