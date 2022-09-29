package com.syntax.GroupProject1;

public class Part1Task03 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.

		int[][] array = { { 1, 2, 3, 4 }, { 20, 30, 40 }, { 55, 77, 66 } };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		System.out.println(sum);
	}
}
