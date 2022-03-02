package be.intecbrussel;

public class NorwegianForestCat extends Felis{
	
	public void miauwInNorvegian() {
		System.out.println("Norvegian cats miauwws");
	}
	int vaccinationCount=3;
	@Override
	
	
    public String toString() {
    	
    	return String.format(
    			"%s is a Norwegian Forest Cat and has %s color " ,
    			
    			getName(), getColor());
    }
 }