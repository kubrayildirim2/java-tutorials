package be.intecbrussel;

public class Acinonyx extends Animal{
	
	private double speed;
	
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public void run() {
		System.out.println("Acinonyx can run .. km");
	}
	public void kiauuww() {
		System.out.println("kiauuww");
	}

	public String toString() {
    	
    	return "Acinonyx";
    }		
}
