package com.lalit.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str  = "restful";
	    String reverse = "";
		
		for(int i=(str.length()-1); i>=0 ; i--){
			System.out.println("characters in reverse\t"+str.charAt(i));
			reverse = reverse+str.charAt(i);
			}
		System.out.println("reversed string is\t"+reverse);
	}

}
