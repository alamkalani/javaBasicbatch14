package com.syntax.class09;

public class Homework4 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.
		
		int[] numbers= {5,9,12,66,35};
		int largestNumber=0;
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i]>largestNumber) {
				largestNumber=numbers[i];
			}
		}
		System.out.println("The largest number is: "+largestNumber);
	}
	

}