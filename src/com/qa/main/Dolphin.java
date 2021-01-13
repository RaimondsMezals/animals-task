package com.qa.main;

public class Dolphin extends Animal {
	
	String colour = "blue";
	
	String type = "water";
	
	int age = 19;
	
	
	@Override
	public void printTypeAndColour() {
		
		System.out.println("This dolphin colour is " + colour + " and he is of " + type + " thing!");
		
	}

	@Override
	public void printAge() {
		
		System.out.println("This dolphin age is " + age);
		
	}

	@Override
	public String toString() {
		return "Dolphin [colour=" + colour + ", type=" + type + ", age=" + age + "]";
	}
	
	
	
	
	
	

}
