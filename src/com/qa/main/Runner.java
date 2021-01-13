package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Mammals cat1 = new Cat();
		
		cat1.warmBlooded();
		cat1.printTypeAndColour();
		cat1.printAge();
		
		Fish shark1 = new Shark();
		
		shark1.coldBlooded();
		shark1.printTypeAndColour();
		shark1.printAge();
		
	}

}
