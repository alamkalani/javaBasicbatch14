package com.syntax.class04;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a house,
		 * otherwise user will consider buying. Once user decides to buy a house,
		 * if price of the house is larger than 200000 than user will take a loan,
		 * otherwise user will pay cash
		 */
		
		//Java class4- Task2
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the mortgage rate");
		double mortgageRate=scanner .nextDouble();
		if (mortgageRate>4.5) {
			System.out.println("You cannot buy the house");
		}
		else {
			System.out.println("You can buy the house");
			System.out.println("How much is the house price?");
		}
		double housePrice=scanner .nextDouble();
		if (housePrice>200000) {
			System.out.println("You are eligible to get a loan");
		}
		else {
			System.out.println("You should pay cash");
		}
	}
}
