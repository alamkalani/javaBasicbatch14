package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {
		/*
		*Create an array of names and store all names of your group.
		*Then print your name from that array.
		*(use 2 different ways of creating an array).
		*/
		
		//first way:
		String[] name=new String[4];
		name[0]="Alam";
		name[1]="Mbarka";
		name[2]="Waad";
		name[3]="Ahmad";
		
		System.out.println(name[0]);

		System.out.println("----------");
		
		//second way:
		String[] names= {"Alam", "Mbarka", "Waad", "Ahmad"};
		System.out.println(name[0]);
	}

}
