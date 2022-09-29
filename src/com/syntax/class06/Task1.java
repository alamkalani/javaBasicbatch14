package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/* Enhance HW code:  Write a program for user to enter his/hers birth month.
		 * Based on the month define the season.
		 * Example: if user is born in March, April, May → season =”Spring” 
         * if user is born in June, July, August → 
		 * season =”Summer”  etc …
         * At the end of the program we should see 1 output as “You were born is season __”.
         */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your birth month");
		String month=scanner.nextLine();
		String season=null;
		if(month.equals("March") || month.equals("April") || month.equals("May")) {
			season="Spring";
		}else if(month.equals("June") || month.equals("July") || month.equals("August")) {
			season="Summer";
		}else if(month.equals("September") || month.equals("October") || month.equals("November")) {
			season="Fall";
		}else if(month.equals("December") || month.equals("January") ||month.equals("February")) {
			season="Winter";
		}
		System.out.println("You were born in season "+season);

	}

}
