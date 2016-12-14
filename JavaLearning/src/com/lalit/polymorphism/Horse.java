package com.lalit.polymorphism;

public class Horse extends Animal{
  public Horse(){
	  
  }
  @Override
  public void eat(){
	 
	  System.out.println("Horse class eat method called");
  }
  
  public void makeNoise(){
	  System.out.println("Henehehe");
  }
}
