package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores
		 *  (quiz, mid term, and final scores) and determine the grade based on the following rules: 
         * if the average score >=90 → grade=A
         * if the average score >= 70 and <90 → grade=B
         * if the average score>=50 and <70 → grade=C
         * if the average score<50 → grade=F
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter quiz score");
		double quiz=scanner.nextDouble();
		System.out.println("Enter mid term score");
		double midTerm=scanner.nextDouble();
		System.out.println("Enter final score");
		double Final=scanner.nextDouble();
		double average;
		average=(quiz+midTerm+Final)/3;
		String grade;
		if(average>=90 && average<=100) {
			grade="A";
		}else if(average>=70 && average<90) {
			grade="B";
		}else if(average>=50 && average<70){
			grade="C";
		}else if(average<50 && average>0) {
			grade="F";
		}else {
            System.out.println("Please enter valid score!");
            grade ="None";
			System.out.println("");
		}
		System.out.println("Grade: "+grade);
	}
}
