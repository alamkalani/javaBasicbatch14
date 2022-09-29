package com.syntax.class11;

public class Phone {
	//Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.
	String model;
	String make;
	String color;
	int storage;
	double size;
	String price;
	
	void call() {
		System.out.println();
	}
	void takingPicture() {
		System.out.println("We can take pichture by "+model);
	}
	void gps() {
		System.out.println(model+" model has GPS");
	}
	public static void main(String[] args) {
		Phone iphone=new Phone();
		iphone.model="iphone 14";
		iphone.make="Apple";
		iphone.color="Gray";
		System.out.println(iphone.model+" has many colors like "+iphone.color);
		iphone.takingPicture();
		
		System.out.println("-----------------------------");
		Phone Pixel=new Phone();
		Pixel.size=6.5;
		Pixel.color="Black";
		Pixel.price="cheap";
		System.out.println("Pixel's size is "+Pixel.size);
		
		
		System.out.println("-----------------------------");
		Phone Samsung=new Phone();
		Samsung.size=6.7;
		Samsung.model="Galaxy";
		Samsung.storage=256;
		Samsung.make="Korea";
		System.out.println("This Samsung phone has "+Samsung.storage+" GB storage");
		Samsung.gps();
	}
}
