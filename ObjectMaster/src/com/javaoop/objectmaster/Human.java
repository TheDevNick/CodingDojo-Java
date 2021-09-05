package com.javaoop.objectmaster;

public class Human {
//	attributes
	protected int Strength = 3;
	protected int Stealth = 3;
	protected int Intelligence = 3;
	protected int Health = 100;
	
//	methods
	public void attack(Human target) {
		target.Health -= this.Strength; 
	}
	
}
