package com.syntax.class09;

public class Homework3 {

	public static void main(String[] args) {
		//Create an array on integers and calculate the sum of all elements in an array.
		
		int[] numbers= {4, 6, 25, 35, 1};
		int sum=0;
		for(int i=0; i<numbers.length; i++) {
			sum+=numbers[i];
		}
		System.out.println("the sum of our numbers is: "+sum);

	}

}
