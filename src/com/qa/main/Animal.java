package com.qa.main;

public class Animal {
	
	String colour;
	
	String type;
	
	int age;
	
	
	public void printTypeAndColour() {
		
		System.out.println("This animal colour is " + colour + " and he is of " + type + " thing!");
		
	}
	
	public void printAge() {
		
		System.out.println("This animal age is " + age);
		
	}

@Override
public String toString() {
	return "Animal [colour=" + colour + ", type=" + type + ", age=" + age + "]";
}
	
	

	

}
