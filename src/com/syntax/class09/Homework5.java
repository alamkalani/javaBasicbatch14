package com.syntax.class09;

public class Homework5 {

	public static void main(String[] args) {
		//Create an array to store char values and then print those in reverse order.
		
		char[] characters= {'A', 'B', 'C', 'D'};
		
		for (int i=(characters.length)-1; i>=0; i--) {
			System.out.print(characters[i]+" ");
		
		}
	}
}
