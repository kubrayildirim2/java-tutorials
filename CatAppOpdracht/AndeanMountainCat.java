package be.intecbrussel;

public class AndeanMountainCat extends Felis{

	@Override
	
	public String toString() {
    	
    	return String.format(
    			"%s is an Andean Mountain Cat and has %s color " ,
    			getName(), getColor());
    }		
	
	public void miauw() {
		System.out.println("AndeanCat miauwws");
	}	
    public static boolean isAlive() {
			return false;	
	}
}