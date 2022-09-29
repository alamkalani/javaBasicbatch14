package com.syntax.GroupProject1;

import java.util.Scanner;

public class Part1Task01 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of integer values. After the array is created,
		 * calculate the sum of all stored elements in that array.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of your array (enter a number)");
		int size = scanner.nextInt();
		int[] array = new int[size];

		System.out.println("Please enter " + size + " numbers to create the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int sum = 0;
		for (int j = 0; j < array.length; j++) {
			sum += array[j];
		}
		System.out.println("The sum of numbers in this array is " + sum);
	}
}
