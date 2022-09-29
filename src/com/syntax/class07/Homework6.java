package com.syntax.class07;

import java.util.Scanner;

public class Homework6 {
	public static void main(String[] args) {
		/*
		 * Declare a variable to store a price for a coffee.
		 * Ask the user to pay for a coffee.
		 * Keep asking to pay for coffee until the user enters the EXACT amount .
		 * If the user gives more than coffee price --> ask them to give less,
		 * if the user gives less money then ask to give more.
		 * Once user give EXACT amount print “Please enjoy your coffee
		 */
         Scanner scanner=new Scanner(System.in);
         double price=7;
         double pay;
         System.out.println("Please enter a price for coffee");
         do {
        	 pay=scanner.nextDouble();
             if(pay>price) {
            	 System.out.println("Please give less");
             }else if(pay<price) {
            	 System.out.println("Please give more");
             }
         }while(price != pay);
         System.out.println("Please enjoy your coffee");
	}
}
