package com.lalit.recursion;

public class FactorialOfNumber {

	//Recursive Way
	public int recursiveFact(int n){
		if(n==0){
			return 1;
		}else if(n==1){
			return 1;
		}else{
			return n*recursiveFact(n-1);
		}
	}
	// Non Recursive Way
	
	public int nonRecursiveFactorial(int n){
		int fact = 1;
		for(int i=n;i>=1;i--){
			fact = fact * i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       FactorialOfNumber number = new FactorialOfNumber();
       int result = number.recursiveFact(4);
       System.out.println("Factorial of 4:\t"+result);
       
       int result2 = number.nonRecursiveFactorial(5);
       System.out.println("Factorial of 5:\t"+result2);
	}

}
