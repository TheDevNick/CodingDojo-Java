package com.javaoop.objectmaster;

public class Wizard extends Human {
	public Wizard() {
		this.Health = 50;
		this.Intelligence = 8;
	}
	
	public void heal(Human target) {
		target.Health += this.Intelligence;
		
	}
	
	public void fireball(Human target) {
		target.Health -= this.Intelligence * 3;
	}
}
