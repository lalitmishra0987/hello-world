package com.lalit.testClasses;

public class B extends A{

	private String Standard;

	public B(){
		System.out.println("B called");
	}
	public String getStandard() {
		return Standard;
	}

	public void setStandard(String standard) {
		Standard = standard;
	}
	
}
