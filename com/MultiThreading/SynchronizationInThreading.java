package com.MultiThreading;

public class SynchronizationInThreading {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WorkUpdate w=new WorkUpdate();
		Runnable r=() ->{
			
			for(int i=0;i<100;i+=10) {
				w.PackingStatus();
			}
		};
		Runnable r1=() ->{
			for(int i=0;i<200;i+=10) {
				w.PackingStatus();
			}
		};
		Runnable r2=() ->{
			for(int i=0;i<150;i+=10) {
				w.PackingStatus();
			}
		};
		Thread t=new Thread(r);
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t.start();
		t1.start();
		t2.start();
		t.join();
		t1.join();
		t2.join();
		System.out.println("total packing count out of 450 :"+w.count);

	}

}

class WorkUpdate{
	int count=0;
	public void PackingStatus() {
		count+=10;
	}
}
//in above case all the threads are updating data at the same time 
//so the output is manuplating and printing everytime a new count
//so that to remove this data manpulation we use "Synchronization"
//this process do that it will allow only one thread at once to update the  data
//so that we can get data acurately
//so synchronization is control the flow of data updation

//we can achive synchronization in 2 ways
//by synchornized the method wich is updating, or 
//syncornize with some block of code

//by using above class example

/*
 * class WorkUpdate{
 *  int count=0;
 *   public void Synchronized PackingStatus() { 
 *   count+=10; 
 *   }
 * }
 */ 
//this is synchronized with method level


/*
 * class WorkUpdate{
 *  int count=0;
 *   public void PackingStatus() { 
 *   synchronized(this){
 *     count+=10;
 *   }
 *   count+=10; 
 *   }
 * }
 */
//this is synchronized with block of code so in the block of code only sychronized

//synchronization is helpful but evevry time using this method performance will be decresed
//why because in the process of execution one thread is updating the remaining threads are in waiting
//so automatically performance will be decreased the main motto of we are using threads for improve performance
//so it usese are limited





