package com.qa.main;

public class Shark extends Animal {
	
	
String colour = "white";
	
	String type = "water";
	
	int age = 7;
	
	@Override
	public void printTypeAndColour() {
		
		System.out.println("This shark colour is " + colour + " and he is of " + type + " thing!");
		
	}

	@Override
	public void printAge() {
		
		System.out.println("This shark age is " + age);
	}

	@Override
	public String toString() {
		return "Shark [colour=" + colour + ", type=" + type + ", age=" + age + "]";
	}
	
	
	

}
