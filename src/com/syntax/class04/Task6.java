package com.syntax.class04;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		/*
		 * Create a Java program that will ask if user has a credit card or not.
		 * If you user does not have a credit card then offer them.
		 * If they do have one ask what is balance on the card?
		 * If balance of the card is larger than 1000, tell them to pay off immediately,
		 * otherwise you can tell them that they can spend more.
		 */
		
		//Java class4- Task6
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have credit card? please enter true or false");
		boolean havingCreditCard=scanner .nextBoolean();
		if (havingCreditCard) {
			System.out.println("what is the balance on the card?");
			double balance=scanner .nextDouble();
			if 	(balance>1000) {
				System.out.println("Please pay off immediately");
			}
			else {
				System.out.println("You can spend more");
			}
		}
		else {
			System.out.println("Please get a credit card");
		}
		
	}
}
