package com.lalit.string;

public class Palindrome {
 
	public static void main(String[] args){
		String originalString = "book";
		String reversedString = "";
		
		for(int i=(originalString.length()-1); i>=0; i--){
			reversedString+=originalString.charAt(i);
		}
		if(originalString.equals(reversedString)){
			System.out.println("String is Palindrome\t"+reversedString);
		}else{
			System.out.println("String is not palindrome\t"+reversedString);
		}
	}
}
