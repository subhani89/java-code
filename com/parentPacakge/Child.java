package com.parentPacakge;

public class Child extends Parent{
	public static void main(String[] args) {
		//Parent p=new Parent();
		//p.method1();
		Child c=new Child();
		c.method1();
		
	}
	@Override
	public void method1() {
		System.out.println("this is method1 from child updated ");
		//this is over riding concept because parent have alredy method1 but in the child
		//we created same method1 and executing the child method and not executing the parent
		
	}
}
