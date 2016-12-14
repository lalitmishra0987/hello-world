package com.lalit.testClasses;

public class A {
   private int id;
   private String name;

   public A(){
	   System.out.println("A Called");
   };
   
   
   public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	System.out.println("Inside A");
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
