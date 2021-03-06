package main.java.classes;

public abstract class Phone {
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringTone;

	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}
	// abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    // getters and setters removed for brevity. Please implement them yourself
    
    public String getVersion() {
    	return this.versionNumber;
    }
    
    public int getPercentage() {
    	return this.batteryPercentage;
    }
    
    public String getCarrier() {
    	return this.carrier;
    }
    
    public String getRingtone() {
    	return this.ringTone;
    }
    
    public void setVersion(String version) {
    	this.versionNumber = version;
    }
    
    public void setPercentage(int percentage) {
    	this.batteryPercentage = percentage;
    }
    
    public void setCarrier(String carrier) {
    	this.carrier = carrier;
    }
    public void setRingtone(String ringtone) {
    	this.ringTone = ringtone;
    }
    
    
}