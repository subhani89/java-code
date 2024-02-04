package com.javaDotLangPackage;

public class ToStringMethod {
	String name;
	int rollno;
	String mail;

public ToStringMethod(String name, int rollno, String mail) {
	super();
	this.name = name;
	this.rollno = rollno;
	this.mail = mail;
}
	public static void main(String[] args) {
		ToStringMethod ts=new ToStringMethod("subhani",100,"subani@gmail.com");
		System.out.println(ts);
		//before override toString() from object class the output will be
		//the address of the method com.javaDotLangPackage.ToStringMethod@4517d9a3 
		//if we delete override method then only address print other wise data will print
	}
	
	
	@Override
	public String toString() {
		return "ToStringMethod [name=" + name + ", rollno=" + rollno + ", mail=" + mail + "]";
		
	}
	
	//after override insted of address the input data printed that means  
			//the local toSting() method executed
}
