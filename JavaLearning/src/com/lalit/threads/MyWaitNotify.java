package com.lalit.threads;

public class MyWaitNotify{

	  MonitorObject myMonitorObject = new MonitorObject();
	  boolean wasSignalled = false;

	  public void doWait(){
	    synchronized(myMonitorObject){
	      if(!wasSignalled){
	      try {
	    	  myMonitorObject.wait();
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	      }
	      
	      wasSignalled = false;
	    }
	  }

	  public void doNotify(){
	    synchronized(myMonitorObject){
	      wasSignalled = true;
	      myMonitorObject.notify();
	    }
	  }
	}
