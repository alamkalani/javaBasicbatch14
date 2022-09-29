package com.syntax.class11;

public class Dog {
 //Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	String breed;
	String gender;
	int age;
	String color;
	String size;
	
	void bark() {
		System.out.println("barking");
	}
	void trainable() {
		System.out.println(breed+" breeds are trainable");
	}
	public static void main(String[] args) {
		Dog Husky=new Dog();
		Husky.breed="Husky";
		Husky.color="black and white";
		Husky.age=10;
		System.out.println("Breed "+Husky.breed+" is "+Husky.color);
		Husky.trainable();
		
		
		System.out.println("-----------------------------");
		Dog Bulldog=new Dog();
		Bulldog.breed="Bulldog";
		Bulldog.color="brown";
		Bulldog.size="big";
		System.out.println("This dog is "+Bulldog.color+" and "+Bulldog.size);
		Bulldog.trainable();
		
		
		System.out.println("-----------------------------");
		Dog Labrador=new Dog();
		Labrador.color="white";
		Labrador.gender="male";
		Labrador.breed="Labrador";
		System.out.println("Breed "+Labrador.breed+" is "+Labrador.color);
		Labrador.bark();
	}
}
