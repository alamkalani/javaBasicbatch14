package com.syntax.class12;

public class StringDemo {

	public static void main(String[] args) {
		// Proper way of creating an object
		String str=new String("Java");
		// Simpler and shorter way provided bu Java creators to make our life a little easier
		String name="Asma Alfadhli The Great"; //Only works for String and Wrapper classes
		//and it is more used
		
		/*
		 *  Counts the number of characters in a string including the spaces
		 */
		
		System.out.println(str.length());
		System.out.println(name.length());
		if(name.length()>15) {
			System.out.println("Name can't be more than 15 characters");
		}
		
	}

}