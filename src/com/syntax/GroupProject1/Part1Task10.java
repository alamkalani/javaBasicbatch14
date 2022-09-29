package com.syntax.GroupProject1;

public class Part1Task10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

		int[] numbers = {100, 5, 7, 20, 25, 80, 66, 35};
		int secondLargestNumber = 0;
		int largestNumber = numbers[0];  //100

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= largestNumber) {
				largestNumber = numbers[i];
			}
		}
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] == largestNumber) {
				continue;

			} else if (numbers[j] > secondLargestNumber) {
				secondLargestNumber = numbers[j];
			}
		}
		System.out.println("The second largest number is " + secondLargestNumber);
	}
}
