package com.syntax.class07;

public class Task5 {

	public static void main(String[] args) {
		// Print only odd numbers from 100 to 1 (2 different ways)
		int num=99;
		while(num>=1) {
			System.out.print(num+" ");
			num-=2;
		}
      System.out.println(" ");
      int num1=99;
      while (num1>=1) {
    	  if(num1 %2 != 0) {
    		  System.out.print(num1+" ");
    	  }
    	  num1--;
      }
	}

}
