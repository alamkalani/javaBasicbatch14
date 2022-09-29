package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		/*Create a 2D array(shorter way)
		 * in which first array will consist of 4 names and second array will contain grades.
		 * Then your program should print name of the students that has A and B grade
		 */
		
		String[][] student= {
				{"Alam", "Mihan", "John", "Jack" },
				{"A", "B", "C", "D"},
		};
		System.out.println(student[0][0]+"="+student[1][0]);
		System.out.println(student[0][1]+"="+student[1][1]);


	}

}
