package com.javaoop.objectmaster;

public class Samurai extends Human {
	private static int numSamurai = 0;
    public static int howMany() {
        return Samurai.numSamurai;
    }
	public Samurai() {
		this.Health = 200;
		Samurai.numSamurai += 1;
	}
	
	public void deathBlow(Human target) {
		target.Health = 0;
		this.Health /= 2;
	}
	
	public void meditate() {
		this.Health += this.Health/2;
	}
}
