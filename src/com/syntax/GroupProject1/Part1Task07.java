package com.syntax.GroupProject1;

import java.util.Scanner;

public class Part1Task07 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scanner.nextInt();
		int a = num / 2;
		boolean prime = true;

		if (num == 0 || num == 1) {
			System.out.println(num + " is not prime number");
		} else if (num < 0) {
			System.out.println("Invalid number");
		} else {
			for (int i = 2; i <= a; i++) {
				if ((num % i) == 0) {
					System.out.println(num + " is not prime number");
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println(num + " is a prime number");
			}
		}
	}
}
