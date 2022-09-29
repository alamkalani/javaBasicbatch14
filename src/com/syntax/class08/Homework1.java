package com.syntax.class08;

public class Homework1 {

	public static void main(String[] args) {
		//Create a digital clock using nested loops
		//if you can, try to have a clock that would show 2 digits for hour and 2 digits for minutes.
		
		for (int a=0; a<=2; a++ ) {
			for (int b=0; b<=9; b++) {
				if(a==2 && (b>=4 && b<=9)) {
					continue;
				}
				for (int c=0; c<=5; c++) {
					for (int d=0; d<=9; d++) {
						System.out.println(a+""+b+":"+c+""+d);
					}
				}
			}
		}

	}
}
