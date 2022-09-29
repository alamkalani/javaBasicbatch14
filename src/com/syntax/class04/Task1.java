package com.syntax.class04;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a program to store a boolean value of whether user has diploma or not.
		 * If user has a diploma, you should say congratulations,
		 * otherwise program should suggest to get a degree.
		 * Then if user has a degree program should check a gpa score.
		 * If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”,
		 * otherwise → “You should have studied harder” .
		 */
		
		//Java Class4-Task1
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have diploma? Please enter true or false");
		boolean userDiploma=scanner .nextBoolean();
		if (userDiploma) {
			System.out.println("congratulations");
		}else {
			System.out.println("You should get a degree");
		}
		if (userDiploma) {
			System.out.println("Please enter yor GPA");
		}
			double gpa=scanner .nextDouble();
		if (gpa>=3.5) {
			System.out.println("You are eligible for scholarship");
		}
		else
		{ System.out.println("You should have studied harder");
		}
	}
}
