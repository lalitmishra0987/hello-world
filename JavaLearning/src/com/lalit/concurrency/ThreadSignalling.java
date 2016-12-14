package com.lalit.concurrency;

public class ThreadSignalling {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		Thread threadB = new Thread();
		threadB.start();
		
		synchronized (threadB) {
			try{
				System.out.println("Waiting for thread............");
				threadB.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Total is" );
		}
	}

}
