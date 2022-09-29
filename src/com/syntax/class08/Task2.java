package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// create a secret number and let user guess the secret number
		//once user guessed your secret number ---> program says you won!
		Scanner scanner=new Scanner(System.in);
		double num=20;
		double guess=0.0;
		do {
		System.out.println("Guess the number");
		guess=scanner.nextDouble();
		      
		} while (guess != num);
		System.out.println("you won!");
	}

}
