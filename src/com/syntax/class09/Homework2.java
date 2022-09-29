package com.syntax.class09;

public class Homework2 {

	public static void main(String[] args) {
		/*Create an array of animals and store 5 elements into it.
		 *Using 2 different loops print all elements from the array.
		 */
		
		//first:
		String[] animals= {"cat","dog","monkey","deer","horse"};
		for (int i=0; i< animals.length; i++) {
			System.out.print( animals[i]+ " ");
		}
		System.out.println();
		System.out.println("-------------------");
		
		//Second:
		String[] animal= {"cat","dog","monkey","deer","horse"};
		for (String name:animal) {
			System.out.print(name+" ");
		}
	
	}

}
