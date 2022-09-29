package com.syntax.class07;

public class Homework3 {

	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)
		//1:
		int num=20;
		while(num>=2) {
			System.out.print(num+" ");
			num-=2;
		}
		System.out.println(" ");
		//2:
		for(int a=20; a>=2; a-=2) {
			System.out.print(a+" ");
		}
		//3:
		System.out.println(" ");
		int b=20;
		while (b>=2) {
		if(b%2==0) {
			System.out.print(b+" ");
		}
			b--;
}
}
}