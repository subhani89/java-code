package com.MultiThreading;

public class ThreadingConcept {

	public static void main(String[] args) throws Exception {
		//A thread in java is the execution path in a program
		//everything runs in a java program is run on a threads
		//every applicatioon in jvm have threads at least one,even if you dont call explicitly
		//it all start with the main method of your code wich is run in the main method thread
		
		//these are the main methos thread which is created by jvm to execute 
		//by using some methods we can check the active thread name,code
		System.out.println("Default thread name wich is created by JVM :"+Thread.currentThread());
		System.out.println("current active threads :"+Thread.activeCount());
		System.out.println("maximum priority of thread :"+Thread.MAX_PRIORITY);
		System.out.println("minimum priority of Thread :"+Thread.MIN_PRIORITY);
		
		//manually we can create thread
		
		Thread t=new Thread();//even if you create the thread it will not start automatically
		
		t.start(); //by using start method we can start the thread internally it will call run()method 
		
		//if you want implement the "run()" method in thread with your own implimentation
		//by using inheritance concept we can override the run() method from thread class 
		
		
			
   
		//by creating below Application class object, we can use the methods in the thread class
		//because Application class is extending the Thread class
		
		Application a=new Application();//from class1 below
		Thread t1=new Thread(a,"subbu");
		
		
		App a2=new App();//from class2 below
		Thread t2=new Thread(a2,"subhani");
		
		
		Name n=new Name("alone");//from class3 below
		n.start();//user defined name created
		
		Runnable r=new Method2();//from class4 below
		r.run();
		//in above case we created class constructor with reference of interface
		//Runnable is a interface and "Method2()" is class wich is implementing interface
		
		//in above case we have created object with Runnable reference 
		//so that we cant call "start()" methos which is in the Thread class
		//by using another way we can get the Start() method from Thread class
		Method3 m=new Method3();
		Thread tt=new Thread(m,"subbu");
		tt.start();
		//this is 2nd way which can use for rename to the Thread
		//while object creation without creating parameterised constuctor in class
		
		
		//and also Runnable is a functional interface so we can use lamda expression to execute program
		//this is the another advantage of implementing interface
		Runnable r1=() -> {System.out.println("this is from lamda expression");};
		r1.run();
		
		
		//by using multiple objects we can create multiple threads
		
		//if you want run the thread one after one then use join() method
		//so after completion of the t1 program then t2 Thread will start
		t1.start();
		t1.join();
		//if you want stop the thread for some time we can use sleep() method
		//by using 10000 milliseconds the Thread will stopes work for 10 seconds and then execute
		t2.start();
		t2.sleep(10000);
		

		System.out.println("current active threads :"+Thread.activeCount());
		
	}

}


//New class1
//To use Inheritance concept, we need a class wich is extending the Thread class
class Application extends Thread{
	@Override
	public void run() {
		System.out.println("this is own implementation of run method from Thread class");
	}
	
}


//New class2
class App extends Thread{
	@Override
	public void run() {
		System.out.println("this is from App class default name of thread is :"+Thread.currentThread().getName()+">>>"+Thread.currentThread().getId());
	}
}



//New class3

//we can give names to the  threads instead of default names
//by using thread constructor
class Name extends Thread{
	public  Name(String name) {
		super(name);
		//in this case we created class constructor with parameters
		//and gave name to thread constructor by using "super" keyword		
	}
	
	@Override
	public void run() {
		System.out.println("user defined name of thread is :"+Thread.currentThread().getName()+">>>"+Thread.currentThread().getId());
		
	}
}

//we have another way to create Thread in java
//that is implementing the "Runnable" interface with a class
//why because Runnable interface also have "run()" unImplemented method
//the reason behind the implementing the interface is multiple Inheritance is not possible in classes
//but in interfaces we can use multiple Inheritance so it is useful for future purpose because
//in future the class needs to another non implemented methods so on that case interface useful


//new class4
class Method2 implements Runnable{

	@Override
	public void run() {
		System.out.println("This is from method2 wich is implementing the Runnable interface");
		
	}
	
}

//new class5
class Method3 implements Runnable{

	@Override
	public void run() {
		System.out.println("This is from method3 wich is implementing the Runnable interface with user defined name :"+">>>"+Thread.currentThread().getName());
		
	}
		
}






