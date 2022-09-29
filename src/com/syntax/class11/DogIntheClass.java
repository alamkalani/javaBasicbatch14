package com.syntax.class11;

public class DogIntheClass {
	
	// State
	// attributes/ properties/ fields
	String name;
	String color;
	String breed;
	double weight;
	int age;
	// These are the behaviors of a dog
	// Methods or functions. In java we called it Methods
	void bark() {
		System.out.println("Barking.......");
	}

	void sleep( ) {
		System.out.println("Dog is sleeping...");
	}
	public static void main(String[] args) {
		// creating objects from a class
		//new Dog();=> it creates an object of class Dog
		DogIntheClass dog1=new DogIntheClass();
		// calling a behavior on an object
		dog1.bark();
		dog1.sleep();
	}
}
