package com.syntax.class12;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: Example Output: Mom’s
		 * first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested baby
		 * name: DANRY Example Output: Mom’s first name? Mary Dad’s first name? Daniel
		 * Boy or Girl? girl Suggested baby name: MAIEL
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the mother's name");
		String mom = scanner.nextLine();
		System.out.println("Enter the father's name");
		String dad = scanner.nextLine();
		System.out.println("Is baby boy or girl?");
		String gender = scanner.nextLine();

		if (gender.equalsIgnoreCase("boy")) {
			System.out.println("Boy Suggested baby name: " + dad.substring(0, dad.length() / 2).toUpperCase()
					+ mom.substring(mom.length() / 2, mom.length()).toUpperCase());
		} else if (gender.equalsIgnoreCase("girl")) {
			System.out.println("Girl Suggested baby name: " + mom.substring(0, mom.length() / 2).toUpperCase()
					+ dad.substring(dad.length() / 2, dad.length()).toUpperCase());
		}
	}

}
