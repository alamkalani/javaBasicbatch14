package com.syntax.class12;

public class Homework2 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS)
		String name = "Monday";
		for (int i = name.length() - 1; i >= 0; i--)
			System.out.print(name.charAt(i) + " ");

	}

}
