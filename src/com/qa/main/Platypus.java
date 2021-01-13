package com.qa.main;

public class Platypus extends Animal implements EggLayable, Walkable {
	
String colour = "grey";
	
	String type = "water/land";
	
	int age = 2;
	
	@Override
	public void printTypeAndColour() {
		
		System.out.println("This platypus colour is " + colour + " and he is of " + type + " thing!");
		
	}

	@Override
	public void printAge() {
		
		System.out.println("This platypus age is " + age);
	}

	@Override
	public String toString() {
		return "Platypus [colour=" + colour + ", type=" + type + ", age=" + age + "]";
	}

	@Override
	public void eggLayer() {
		
		System.out.println("I lay eggs!");
		
	}
	
	@Override
	public void canWalk() {
		
		System.out.println("I can walk!");
		
	}
	
	

}
