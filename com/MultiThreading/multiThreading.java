package com.MultiThreading;

public class multiThreading {

	public static void main(String[] args) throws Exception {
		// Every thread has a life cycle
		//1-new
		//2-runnable
		//3-Blocked
		//4-waiting(join)
		//5-waiting(specific time/sleep)
		//6-terminated
		
		//we cant check the stages of blocking,waiting
		//but we can check the remaining life cycle status
		
		Thread t=new Thread();
		System.out.println(t.getState());
		t.start();
		System.out.println(t.getState());
		
		t.sleep(5000);
		System.out.println(t.getState());
		
		Thread t1=new Thread();
		System.out.println(t1.getState());
		
		//1st stage is "new" because its not started
		//2nd stage is the Thread was started. so the status is "Runnable"
		//3rd stage is witing 5seconds because we used "sleep()" method
		//4th stage is after sleep is "Terminated" means the working of Thread is stoped and deleted
		//and then we created new Thread so the status if new thread is "new"
		
		//this is one method to impliment the run method from Runnable interface
		//by using a instance of external class
		Employee em=new Employee();
		Thread e=new Thread(em,"subhani");
		e.run();
		em.m1();
		
		//this is another method without using any class instance and 
		//implementing the runnable interface by using lamda experssion
		Runnable r=() ->System.out.println("this is run() method from Runnable interface implemented by using lamda expression");
		r.run();
		

	}

}

class Employee extends Thread{
	@Override
	public void run() {
		System.out.println("employee class run method wich is overrided from Thread class");
	}
	public void m1() {
		System.out.println("this is m1 method from employee class");
	}
}
