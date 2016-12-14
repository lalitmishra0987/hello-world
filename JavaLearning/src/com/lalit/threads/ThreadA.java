package com.lalit.threads;

public class ThreadA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadB b = new ThreadB();
		 b.start();
	    b.setName("zed");
		synchronized(b) {
		 try {
		// Main thread entered the block by obtaining lock on monitor of Object of ThreadB 	 
		 System.out.println("Current Thread"+Thread.currentThread().getName()); //Output Main Thread
		 System.out.println("Waiting for b to complete...");
		 b.wait(); // Main Thread Called wait on target thread b and then releases its monitor and goes into waiting state and will wait until notify
		 // is called in target thread i.e thread b.

		 } catch (InterruptedException e) {}
		 System.out.println("Total is: " + b.total);
		 }
	}

}
