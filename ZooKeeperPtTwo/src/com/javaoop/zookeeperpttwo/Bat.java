package com.javaoop.zookeeperpttwo;

public class Bat {
	protected int energyLevel = 300;
	public void fly() {
		System.out.println(" Bat is flying! Current Energy: " + energyLevel);
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println(" Bat is eating humans! Current Energy: "+ energyLevel);
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println(" Bat is attacking town! Current Energy: "+energyLevel);
		energyLevel -= 100;
	}
}
