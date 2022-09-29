package com.syntax.class09;

public class Homework1 {

	public static void main(String[] args) {
		/* HW. 1. Create an array of cars and store 6 elements into it.
		 * Using 2 different loops print all values from the array.
		 */
		
		//first way:
		String[] cars= {"BMW", "Nissan","Toyota","Hyundai","Benz","Jeep"};
		for (int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		System.out.println();
		System.out.println("-------------------");
		
		//second way:
		String[] car= {"BMW", "Nissan","Toyota","Hyundai","Benz","Jeep"};
		for (String name:car) {
			System.out.print(name +" ");
		}
	}

}
