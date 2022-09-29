package com.syntax.class07;

public class Homework4 {

	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)
		
		//1:
		for(int a=21; a<50; a+=2) {
			System.out.print(a+" ");
		}
		System.out.println(" ");
		
		//2:
		int b=21;
		while (b<50) {
			if(b%2 != 0) {
				System.out.print(b+" ");
			}
			b++;
		}
	}
}
