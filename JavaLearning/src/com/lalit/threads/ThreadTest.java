package com.lalit.threads;

public class ThreadTest implements Runnable{

	private static int count;

	@Override
	public void run() {
		// TODO Auto-generated method stub
     synchronized (this) {
    	 for(int i=1;i<=10;i++){
 			count+=i;
 			System.out.println(Thread.currentThread().getName()+"\t"+count);
 		}
    		notify();
    		System.out.println("Notify called");
	}
   }
	public static void main(String[] args){
		ThreadTest test = new ThreadTest();
		Thread one = new Thread(test);
		Thread two = new Thread(test);
		// Thread three = new Thread(test);
		one.setName("Lalit");
		two.setName("Raghu");
		one.start();
        two.start();
		System.out.println(Thread.currentThread().getName()+"\t"+Thread.currentThread().getState());
		
		
        synchronized(one){
        	try {
        		System.out.println(Thread.currentThread().getName());
				one.wait();
				System.out.println("Lalit is waiting.......");
				System.out.println(Thread.currentThread().getName()+"\t"+Thread.currentThread().getState());
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	System.out.println(Thread.currentThread().getName()+"\tTotal Count is"+test.count);
        }
         
		// three.start();
	}
}
