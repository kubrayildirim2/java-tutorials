package be.intecbrussel;

public class PersianCat extends Felis {
	
	@Override
	
	    public String toString() {
        	
        	return String.format(
        			
        			"%s is an Persian Cat and has %s color " ,
        			
        			 getName(), getColor());
        }
    	
	    public void miauw() {
		System.out.println("Persian Cats miauwwww");
		
		
    }
}