package be.intecbrussel;

public class Animal {
	
	protected static int animalCount;
    private char size;
	private char coat;
	private String color;
	private double weight;
	 
	public static int getAnimalCount() {
		return animalCount;
	}

	public static void setAnimalCount(int animalCount) {
		Animal.animalCount = animalCount;
	}
	
	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public char getCoat() {
		return coat;
	}

	public void setCoat(char coat) {
		this.coat = coat;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void eat() {
		
		System.out.println("Animals eat");
	}

	public void makeNoise() {
		System.out.println("Animals make noise");
	}

	public void sleep() {
		System.out.println("Animals sleep");
	}
	public static boolean isAlive() {
		return true;
	}

	

    }
		


