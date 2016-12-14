package com.lalit.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class ProcessingThread implements Runnable {

	private AtomicInteger count = new AtomicInteger();
	@Override
	public void run() {
		// TODO Auto-generated method stub

		 for(int i=0;i<5;i++){
			 processingSomething(i);
			 count.incrementAndGet();
			 System.out.println("Thread Name\t"+Thread.currentThread().getName()+"\tThread Count After Each Increment :"+count.get());
		 }
	}

	/**
	 * @param args
	 */
	
	 public int getCount(){
		 return this.count.get();
	 }
	
	 public void processingSomething(int i){
		 try{
			 Thread.sleep(i*1000);
			 
		 }catch(InterruptedException e){
			 e.printStackTrace();
		 }
	 }

}
