package com.syntax.class12;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: 
		 *if the String has an odd number of characters and has 3 or more characters,
		 *print the character in the middle of the String.
		 */
		String name="I like Java";
		int a=(name.length())%2;
		int b=name.length()/2;
		if (!name.isEmpty() && a!=0 && name.length()>=3) {
		System.out.println(name.charAt(b));
		}

	}

}
