package arraysOpdracht;

import java.util.Arrays;
import java.util.Scanner;



public class ArrayApp {
	public static void main(String[] args) {
		
		int numbers[]= {4,5,6,3};
		
		
		IntArrayTools.isSorted(numbers);
		
		
		 System.out.println("Number are now sorted "+ Arrays.toString(numbers));
		
		 int a= numbers.length;
		 for(int i=a-1; i>-1; i-- ) {
			 
			 
			 
		System.out.println(numbers[i]);
		 }
		
		Scanner kbd= new Scanner(System.in);
		System.out.println("Please fill a char");
	    String s1 = kbd.nextLine();
	    System.out.println("Please fill a char");
	    String s2 = kbd.nextLine();
	    System.out.println("Please fill a char");
	    String s3= kbd.nextLine();
		
	    String Chars[]= {s1,s2,s3};
	    
	    CharArrayTools.sortLine(Chars);
	    
	    System.out.println(Arrays.toString(Chars));
	    
	    
		 
		
		}

}
