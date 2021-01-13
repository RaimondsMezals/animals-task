package com.qa.main;

public class Cat extends Animal implements Walkable {
	
	String colour = "brown";
	
	String type = "land";
	
	int age = 3;
	
	@Override
	public void printTypeAndColour() {
		
		System.out.println("This cat colour is " + colour + " and he is of " + type + " thing!");
		
	}

	@Override
	public void printAge() {
		
		System.out.println("This cat age is " + age);
	}

	@Override
	public String toString() {
		return "Cat [colour=" + colour + ", type=" + type + ", age=" + age + "]";
	}

	@Override
	public void canWalk() {
		
		System.out.println("I can walk!");
		
	}
	
	
	
	
	

	
	
}
