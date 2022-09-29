package com.syntax.class04;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		/*
		 * You are DMV representative and you need to ask customer their age.
		 * If they are 18 and older you will issue a driver licence to them,
		 * otherwise you will offer them to get a learners permit.
		 */
		
		//Java class4- Task4
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your age");
		double age=scanner .nextDouble();
		if (age>=18) {
			System.out.println("You are eligible to get driver's license");
		}
		else {
			System.out.println("You can only get permit driver's license");
		}

	}

}