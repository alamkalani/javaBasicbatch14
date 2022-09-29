package com.syntax.class06;

import java.util.Scanner;

public class Homework1If {

	public static void main(String[] args) {
		/* Ask user to enter their country and capture it.
		 * Once values are captured print which language user speaks.
		 * Please complete this assignment in 2 ways: using if statement and switch case.
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scanner.nextLine();
		String language;
		if (country.equalsIgnoreCase("Iran")) {
			language="Farsi";
		}else if(country.equalsIgnoreCase("USA")) {
			language="English";
		}else if(country.equalsIgnoreCase("Mexico")) {
			language="Spanish";
		}else if(country.equalsIgnoreCase("Russia")) {
			language="Russian";
		}else if(country.equalsIgnoreCase("Australia")) {
			language="English";
		}else {
			language="unknown language";
		} System.out.println("You speak "+language);
	}
}
