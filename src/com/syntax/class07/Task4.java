package com.syntax.class07;

public class Task4 {

	public static void main(String[] args) {
		// Print even numbers from 20 to 100 (2 different ways)
		int num=20;
		while(num<=100) {
			System.out.print(num+" ");
			num+=2;
		}
System.out.println(" ");
         int num1=20;
         while (num1<=100) {
        	 if(num1 % 2 ==0) {
        		 System.out.print(num1+" ");
        	 }
        	 num1++;
         }
	}

}
