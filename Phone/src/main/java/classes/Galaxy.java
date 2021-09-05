package main.java.classes;

import main.java.interfaces.Ringable;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public void displayInfo() {
        // your code here
    	System.out.println("Galaxy Version:" + this.getVersion() + ", battery percentage:" + this.getPercentage() + "." + "carrier:" + this.getCarrier() + " Ringtone: " + this.getRingtone());
    }

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return "Ring!";
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlocked";
	}
}
