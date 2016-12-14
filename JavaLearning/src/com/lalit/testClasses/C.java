package com.lalit.testClasses;

public class C extends B{
	
	private int marks;
	
	public C(){
		System.out.println("C Called");
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	/*@Override
	public String getName(){
		System.out.println("Inside get of C");
		return "Shyam";
	}*/
	public static void main(String[] args){
		A a = new C();
		C c = (C) new A();
		c.getName();
		a.getName();
	}
	
}
