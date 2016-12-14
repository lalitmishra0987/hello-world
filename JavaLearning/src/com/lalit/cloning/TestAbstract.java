package com.lalit.cloning;

public abstract class TestAbstract implements TestInterface {

	public TestAbstract(){
	
	}
	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		System.out.println(TestInterface.i);
		return i;
	}
}
