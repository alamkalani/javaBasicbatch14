package com.syntax.GroupProject1;

public class Part1Task04 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers.
		 * Develop a program which will identify/print the even numbers only.
		 */

		int[][] numbers = { { 1, 3, 8, 9 }, { 2, 66, 100, 35 }, { 25, 4, 7 } };
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] % 2 == 0) {
					System.out.print(numbers[i][j]+" ");
				}
			}
		}
	}
}
