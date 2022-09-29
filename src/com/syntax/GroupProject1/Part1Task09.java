package com.syntax.GroupProject1;

public class Part1Task09 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?

		int[] numbers = { 1, 4, 7, 9, 45, 98, 5, 34, 14};
		int max = numbers[0];
		int min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}

			else if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("Maximum= " + max);
		System.out.println("Minimum= " + min);
	}

}
