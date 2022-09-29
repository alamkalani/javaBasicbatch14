package com.syntax.class06;

import java.util.Scanner;

public class Homework1Switch {

	public static void main(String[] args) {
		/* Ask user to enter their country and capture it.
		 * Once values are captured print which language user speaks.
		 * Please complete this assignment in 2 ways: using if statement and switch case.
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scanner.nextLine();
		String language;
		switch(country){
		case"Iran":
			language="Farsi";
			break;
		case"USA":
			language="English";
			break;
		case"Mexico":
			language="Spanish";
			break;
		case"Russia":
			language="Russian";
			break;
		case"Australi":
			language="English";
			break;
		default:
			language="Unknown language";
			break;	
		}
		System.out.println("You speak "+language);
	}
}
