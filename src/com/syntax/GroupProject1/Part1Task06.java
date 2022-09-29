package com.syntax.GroupProject1;

public class Part1Task06 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?

		int a = 8;
		int b = 3;

		a = a - b;
		b = a + b;
		a = b - a;

		System.out.println("the new value of number a is: " + a);
		System.out.println("The new value of number b is: " + b);

	}

}
