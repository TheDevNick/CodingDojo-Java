package com.javaoop.objectmaster;

public class Ninja extends Human {
	public Ninja() {
		this.Stealth = 10;
	}
	
	public void steal(Human target) {
		target.Health -= this.Stealth;
		this.Health += this.Stealth;
	}
	
	public void runAway() {
		this.Health -= 10;
	}
}
