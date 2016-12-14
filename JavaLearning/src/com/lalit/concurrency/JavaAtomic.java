package com.lalit.concurrency;

public class JavaAtomic {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ProcessingThread pt = new ProcessingThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt,"t2");
        t2.start();
        t1.join();
		t2.join();
        System.out.println("Count\t"+pt.getCount());
        
	}

}
