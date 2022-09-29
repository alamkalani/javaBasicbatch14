package com.syntax.GroupProject1;

public class Part1Task11 {

	public static void main(String[] args) {
		//Write a program to print out duplicate elements from an Array of Strings?
		
		String[] elements= {"Spring", "Summer", "Spring", "Fall", "Summer", "Winter"};
		
		for (int i=0; i<elements.length; i++) {
			for (int j=i+1; j<elements.length; j++) {
				if (elements[i].equalsIgnoreCase(elements[j])) {
					System.out.println("The word "+elements[i]+" and "+elements[j]+" are the same.");
				}
			}
		}
	}
}
