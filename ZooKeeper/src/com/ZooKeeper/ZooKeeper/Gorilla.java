package com.ZooKeeper.ZooKeeper;

public class Gorilla extends Mammal{
	private String Name = "Harambe";

	public void throwSomething() {
		System.out.println(Name + " has thrown something!");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println(Name + " likes bannanas!");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println(Name + " has climbed the tree!");
		energyLevel -= 10;
	}
}
