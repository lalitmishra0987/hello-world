package com.lalit.polymorphism;

public class TestDynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Animal horse = new Horse();
       horse.eat();
       // You cannot call horse class makeNoise method because
       //reference variable is of type Animal 
       
       Horse horse1 = new Horse();
       horse1.eat();
       horse1.makeNoise();
	}

}
