package com.syntax.class06;

import java.util.Scanner;

public class Homework2Switch {

	public static void main(String[] args) {
		/*Allow user to enter grade (A, B, or C etc...)
		 * and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 * At the end your program should print which grade was entered by a user with explanation.
		 * Please complete this assignment in 2 ways: using if statement and switch case.
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your grade");
		char grade=scanner.next().charAt(0);
		String gradeExplanation;
		switch(grade) {
		case'A':
			gradeExplanation="Excellent";
			break;
		case'B':
			gradeExplanation="Good";
			break;
		case'C':
			gradeExplanation="Average";
			break;
		case'D':
			gradeExplanation="Bad";
			break;
		default:
			gradeExplanation="Not Acceptable";
			break;
		}
		System.out.println("Your grade is "+grade+"-"+gradeExplanation);
	}
}
