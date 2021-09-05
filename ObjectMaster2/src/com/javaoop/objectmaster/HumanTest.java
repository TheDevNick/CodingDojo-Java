package com.javaoop.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human wizard = new Human();
		Human ninja = new Human();
		Samurai samurai = new Samurai();
		
		wizard.attack(ninja);
		System.out.println("Wizard attacked ninja, ninja health is " + ninja.Health);
		
		samurai.deathBlow(ninja);

		System.out.println("samaraui did a death blow to ninja, ninja health: " + ninja.Health);

	}

}
