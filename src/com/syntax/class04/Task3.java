package com.syntax.class04;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*You are a loan specialist and you need to ask user what is the amount of loan is needed.
		 * If loan is less or equal to 200,000
		 * then you would lend the money
		 * otherwise you would reject the client.
		 */
		
		//Java class4- Task3
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("How much do you need for loan?");
		double loanNeeded=scanner .nextDouble();
		if (loanNeeded<=200000) {
			System.out.println("You are eligible to get the loan");
		}
		else {
			System.out.println("Your loan request is rejected");
		}

	}

}
